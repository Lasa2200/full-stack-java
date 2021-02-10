package cl.java.EncuestadelDojo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class EncuestaDelDojoController {
	@RequestMapping("/")
	public String formulario() {
		System.out.println("aca tu formulario");


		return "/formulario.jsp";

	}
	@RequestMapping(value="/resultado", method=RequestMethod.POST)
	public String resultado(@RequestParam(value="username") String username ,@RequestParam(value="location") String location, 
			@RequestParam(value="lenguaje") String lenguaje, @RequestParam(value="descripcion") String descripcion,Model model) {
		model.addAttribute("username",username);
		model.addAttribute("location",location);
		model.addAttribute("lenguaje",lenguaje);
		model.addAttribute("descripcion",descripcion);
		
		if (lenguaje.equals("Java")) {
			return"/java.jsp"; 
		}
		return "/resultado.jsp"; 
	}

	
	@RequestMapping("/java")
	public String resultado2() {
		
		return"/java.jsp"; 
	
	}
}
