package cl.java.web.LibrosApi.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import cl.java.web.LibrosApi.Models.Libro;
import cl.java.web.LibrosApi.Repositorie.LibroRepository;

@Service
public class LibroService {

	private final LibroRepository libroRepository ;

	public LibroService(LibroRepository libroRepository) {
		this.libroRepository = libroRepository;
	}
	//Devolviendo todos los libros.
	public List<Libro> allLibro() {
		return libroRepository.findAll();
	}
	//Creando un libro.
	public Libro createLibro(Libro b) {
		return libroRepository.save(b);
	}
	//Obteniendo la información de un libro
	public Libro findLibro(Long id) {
		Optional<Libro> optionalLibro = libroRepository.findById(id);
		if(optionalLibro.isPresent()) {
			return optionalLibro.get();
		} else {
			return null;
		}
	}
}
