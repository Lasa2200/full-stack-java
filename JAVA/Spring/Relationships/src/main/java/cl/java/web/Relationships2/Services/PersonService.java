package cl.java.web.Relationships2.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.java.web.Relationships2.Models.Person;
import cl.java.web.Relationships2.Repositories.PersonRepository;


@Service
public class PersonService {

	    //Agregando  al repositorio como una dependencia
		private final PersonRepository personRepository;
	    
	    public PersonService(PersonRepository personaRepository) {
	        this.personRepository = personaRepository;
	    }
	    //Devolviendo todos 
	    public List<Person> allPerson() {
	        return (List<Person>) personRepository.findAll();
	    }
	    //Creando 
	    public Person createPerson(Person person) {
	        return personRepository.save(person);
	    }
	    //Obteniendo la información 
	    public Person findPersona(Long id) {
	        Optional<Person> optionalPerson = personRepository.findById(id);
	        if(optionalPerson.isPresent()) {
	            return optionalPerson.get();
	        } else {
	            return null;
	        }
	    }
	}


