package com.Lisbeth.nuevoProyecto.web.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PersonaController {

	@RequestMapping("/persona")
	public String validarPersona() {
		System.out.println("Validando persona");

		return "persona.jsp";
	}

	@RequestMapping("/persona/variable")
	public String miFuncion(Model model) {// instancia de la clase model
		model.addAttribute("soto",2021);
		return "persona.jsp";
	}

	//redireccionamiento a otra url
	@RequestMapping("/persona/llamado")
	public String llamado(){

		return "redirect:/otro/metodo";
	}



}
