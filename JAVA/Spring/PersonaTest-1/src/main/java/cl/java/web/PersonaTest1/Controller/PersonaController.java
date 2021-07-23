package cl.java.web.PersonaTest1.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import cl.java.web.PersonaTest1.Models.Persona;

@Controller
public class PersonaController {
	@GetMapping ("/")
	public String listarpersonas() {
		return "index.jsp";
		
	}
	
	@GetMapping("/crear")
	public String agregarPersona(@ModelAttribute("persona") Persona persona){ 
 	return "agregarPersona.jsp";
 }
}
