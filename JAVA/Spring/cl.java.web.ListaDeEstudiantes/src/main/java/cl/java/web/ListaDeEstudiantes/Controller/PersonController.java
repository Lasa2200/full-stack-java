package cl.java.web.ListaDeEstudiantes.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.java.web.ListaDeEstudiantes.Model.Person;
import cl.java.web.ListaDeEstudiantes.Services.PersonService;

@Controller


public class PersonController {
	@Autowired 
	public PersonService ps;
	
	
	@RequestMapping ("/")
	public String Persona () {
		return "newPerson.jsp";
	}

	@RequestMapping ("/persons/new")
	public String registro(@RequestParam (value="first_name") String first_name,
		@RequestParam (value="last_name")String last_name){
		Person person =new Person ();
		person.setFirstName(first_name);
		person.setLastName(last_name);
		
		ArrayList<Person> retornoPersonas = ps.guardarPersona(person);
		System.out.println(first_name+" "+ last_name);
		return "newPerson.jsp";
	}
}