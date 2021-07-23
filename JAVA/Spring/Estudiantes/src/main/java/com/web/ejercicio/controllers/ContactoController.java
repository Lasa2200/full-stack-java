package com.web.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.ejercicio.models.Contacto;
import com.web.ejercicio.models.Estudiante;
import com.web.ejercicio.services.ContactoService;
import com.web.ejercicio.services.EstudianteService;

@Controller
public class ContactoController {
	@Autowired
	public EstudianteService estuService;
	
	@Autowired
	public ContactoService contactoService;
	
	@GetMapping("/contactos/crear")
	public String crearContacto(Model model ) {
		
		List<Estudiante> listaEstudiantes = estuService.obtenerTodosEstudiantes();
		model.addAttribute("listaEstudiantes",listaEstudiantes);
		model.addAttribute("contacto",new Contacto());
		return "/contactos/crear.jsp";
	}
	
	@PostMapping("/contactos/crear")
	public String insertarContacto(@ModelAttribute("contacto") Contacto contacto) {
		System.out.println(contacto);
		contactoService.insertarContacto(contacto);
		return "index.jsp";
	}

}
