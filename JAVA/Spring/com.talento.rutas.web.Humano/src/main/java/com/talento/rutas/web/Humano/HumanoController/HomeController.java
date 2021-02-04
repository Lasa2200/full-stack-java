package com.talento.rutas.web.Humano.HumanoController;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@Controller

public class HomeController {

	@RequestMapping("/{nombre}")
	public String  saludoHumano(@PathVariable("nombre") String nombre){

		if (!"".equals(nombre)) {

			return "Hello " +nombre;
		}
		return "Hola Humano";
	}
}

