package com.talento.rutas.web.Controller;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController("/")
public class CodingController {
	@RequestMapping
	public String coding() {
		System.out.println("¡Hola Coding Dojo!");
		return "¡Hola Coding Dojo!";
		
	}
	@RequestMapping("/coding/python")
	public String python() {
		System.out.println("¡Python/Django fue increíble!");
		return "¡Python/Django fue increíble!";
		
	}
	@RequestMapping("/coding/java")
	public String java() {
		System.out.println( "¡Java/Spring es mejor!");
		return "¡Java/Spring es mejor!";
		
	}

}

