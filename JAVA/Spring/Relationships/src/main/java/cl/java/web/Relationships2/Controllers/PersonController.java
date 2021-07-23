package cl.java.web.Relationships2.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.java.web.Relationships2.Models.Person;
import cl.java.web.Relationships2.Services.LicenseService;
import cl.java.web.Relationships2.Services.PersonService;

@Controller
public class PersonController {

	@Autowired
	private PersonService personService;

	@Autowired
	private LicenseService licenseService;

	@GetMapping ("/")
	public String Index () {
		return "prueba.jsp";
	}


	@GetMapping("/person")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "person.jsp";
	}

	@PostMapping("/person/new")
	public String create( @ModelAttribute("person") Person person) {
		personService.createPerson(person);
		return "redirect:/license";
	}
	@GetMapping("/mostrar")
	public String Mostrar () {
		return "creado.jsp";
	}
}



