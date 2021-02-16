package cl.java.web.ListaDeEstudiantes.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.ListaDeEstudiantes.Model.Person;
import cl.java.web.ListaDeEstudiantes.Repositories.PersonRepository;

@Service
public class PersonService {

@Autowired 
public PersonRepository pr;
public ArrayList<Person> guardarPersona (Person person) {
	pr.save(person);
	return pr.findAll();
}

}
