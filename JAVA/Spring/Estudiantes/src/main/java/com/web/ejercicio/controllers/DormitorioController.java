package com.web.ejercicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.ejercicio.models.Dormitorio;
import com.web.ejercicio.models.Estudiante;
import com.web.ejercicio.services.DormitorioService;
import com.web.ejercicio.services.EstudianteService;

@Controller
public class DormitorioController {
	
	@Autowired
	public DormitorioService dorService;
	
	@Autowired
	public EstudianteService estuService;
	
	@GetMapping("/dormitorio/crear")
	public String crearDormitorio(Model model) {
		model.addAttribute("dormitorio", new Dormitorio());
		return "/dormitorios/crearDormitorios.jsp";
	}
	
	@PostMapping("/dormitorio/crear")
	public String insertarDormitorio(@ModelAttribute("dormitorio") Dormitorio dormitorio) {
		dorService.insertarDormitorio(dormitorio);
		return "index.jsp";
	}
	
	@GetMapping("/dormitorio/listar")
	public String listarDormitorios(Model model) {
		model.addAttribute("listaDormitorios",dorService.listarDormitorios());		
		return "/dormitorios/listarDormitorios.jsp";
	}
	
	@RequestMapping("/dormitorio/{id}")
	public String agregarEstudianteDormitorio(
			@PathVariable("id") Long id, Model model
			) {
		
		model.addAttribute("listaEstudiantes", estuService.obtenerTodosEstudiantes());
		model.addAttribute("dormitorio",dorService.obtenerDormitorio(id));
		model.addAttribute("estudiante",new Estudiante());
		model.addAttribute("ListaEstudiantesDormitorio", estuService.findAllByDormitorioId(id));
		return "/dormitorios/dormitorioEstudiantes.jsp";
		
	}
	

}
