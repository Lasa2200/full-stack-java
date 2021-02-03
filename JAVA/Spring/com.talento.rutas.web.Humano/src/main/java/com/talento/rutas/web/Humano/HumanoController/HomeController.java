package com.talento.rutas.web.Humano.HumanoController;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class HomeController {

	@RequestMapping("/{nombre}/{apellido}")
	public String  saludoHumano(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){
		return "H ello "+nombre +" "+apellido;
	

	if ("nombre"+"apellido".equals(apellido + nombre) != null{
		System.out.println(nombre + apellido);
		return "nombre"+nombre +"apellido" + apellido;
	
	}else {
		
		return "Hola Humano";

	}
	}	
}


