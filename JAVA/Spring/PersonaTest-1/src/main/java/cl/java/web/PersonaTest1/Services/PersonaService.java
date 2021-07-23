package cl.java.web.PersonaTest1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import cl.java.web.PersonaTest1.Models.Persona;
import cl.java.web.PersonaTest1.Repositrories.PersonaRepository;

@Service
public class PersonaService {



	@Autowired
	private PersonaRepository personaRepo;

	public Persona agregarPersona (Persona persona) {
		return personaRepo.save(persona);
	}

}


