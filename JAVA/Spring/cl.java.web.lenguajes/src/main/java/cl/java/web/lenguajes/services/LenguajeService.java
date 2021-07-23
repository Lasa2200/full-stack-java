package cl.java.web.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.java.web.lenguajes.models.LenguajeModel.Lenguaje;
import cl.java.web.lenguajes.repositories.LenguajeRepository;

@Service
public class LenguajeService {

	private final LenguajeRepository lenguajeRepository;

	public LenguajeService(LenguajeRepository lenguajeRepository) {
		this.lenguajeRepository = lenguajeRepository;		
	}
	public List<Lenguaje> allLenguaje() {
		return lenguajeRepository.findAll();
	}
	//Creando un Lenguaje.
	public Lenguaje createLenguaje(Lenguaje lenguaje) {
		return lenguajeRepository.save(lenguaje);
	}
	//Obteniendo la información de un lenguaje
	public Lenguaje findBook(Long id) {
		Optional<Lenguaje> optionalLanguaje = lenguajeRepository.findById(id);
		if(optionalLanguaje.isPresent()) {
			return optionalLanguaje.get();
		} else {
			return null;
	}  
	}

}