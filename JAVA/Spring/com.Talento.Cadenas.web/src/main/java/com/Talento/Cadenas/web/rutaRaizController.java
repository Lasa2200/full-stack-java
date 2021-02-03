package com.Talento.Cadenas.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class rutaRaizController {

	//metodo
	@RequestMapping("/")
	public String Raiz() {
		System.out.println("Estoy en el controlador Raiz");
		return "raiz.jsp";
	}

	@RequestMapping("/Random")
	public String Random() {
		System.out.println("Spring Boot me permite estar dentro del Random");
		return "random.jsp";
	}

}
