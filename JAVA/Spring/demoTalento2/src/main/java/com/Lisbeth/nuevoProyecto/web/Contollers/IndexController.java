package com.Lisbeth.nuevoProyecto.web.Contollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class IndexController {

	//metodo
	@RequestMapping("/")
	public String home() {
		System.out.println("Estoy en el controlador Home");
		return "index.jsp";
	}
	
	@RequestMapping("/home2")
	public String home2() {
		System.out.println("Estoy dentro del Home2");
		return "HomeFile.jsp";
	}
	@RequestMapping("/otro/metodo")
	public String ruta2() {
		return "index.jsp";
	}

}
