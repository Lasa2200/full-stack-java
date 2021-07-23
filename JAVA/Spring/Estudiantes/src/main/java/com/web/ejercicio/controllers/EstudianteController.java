package com.web.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.ejercicio.models.CursoEstudiante;
import com.web.ejercicio.models.Estudiante;
import com.web.ejercicio.services.ContactoService;
import com.web.ejercicio.services.CursoEstudianteService;
import com.web.ejercicio.services.CursoService;
import com.web.ejercicio.services.EstudianteService;

@Controller
public class EstudianteController {
	@Autowired
	public CursoEstudianteService ceService;
	@Autowired
	public EstudianteService estuService;
	@Autowired
	CursoService cursoService;
	@Autowired
	public ContactoService contactoService;
	
	
	@GetMapping("/estudiantes/crear")
	public String crearEstudiante(@ModelAttribute("estudiante") Estudiante estudiante ) {
		return "/estudiantes/crear.jsp";
	}
	
	@PostMapping("/estudiantes/crear")
	public String insertarEstudiante(
			@ModelAttribute("estudiante") Estudiante estudiante
			) {
		
		estuService.agregarEstudiante(estudiante);
		
		return "index.jsp";
	}	

	@GetMapping("/estudiantes/listar")
	public String listarEstudiantes(Model model) {
		//consultando desde estudiantes
		List<Estudiante> listaEstudiantes = estuService.obtenerTodosEstudiantes();
		model.addAttribute("listaEstudiantes", listaEstudiantes);
		//consultando desde contactos
		model.addAttribute("listaContactos", contactoService.obtenerTodosContactos());
		
		return "/estudiantes/listarEstudiantes.jsp";
	}
	
	@PostMapping("/estudiante/asociarDormitorio")
	public String asociarDormitorio(
			@ModelAttribute("estudiante") Estudiante estudiante ) {
		Estudiante estudiante2 = estuService.findById(estudiante.getId());
		estudiante2.setDormitorio(estudiante.getDormitorio());
		estuService.agregarEstudiante(estudiante2);
		
		return "redirect:/dormitorio/"+estudiante2.getDormitorio().getId();
	}

	@GetMapping("/estudiante/removerDormitorio/{id}")
	public String removerDormitorio(
			@PathVariable("id") Long id) {
		
		Estudiante estudiante = estuService.findById(id);
		Long dormitorioId= estudiante.getDormitorio().getId();
		
		estudiante.setDormitorio(null);
		estuService.agregarEstudiante(estudiante);
		
		return "redirect:/dormitorio/"+dormitorioId;
	}
	
	@RequestMapping("/estudiante/{id}")
	public String asociarEstudianteCurso(
			@PathVariable("id") Long id, Model model
			) {
		model.addAttribute("estudiante",estuService.findById(id));
		
		model.addAttribute("listaCursos", cursoService.listarCursos());
		model.addAttribute("cursoestudiante",new CursoEstudiante());
		
		model.addAttribute("ListaCursoEstudiantes", ceService.findAllByEstudianteId(id));
		
		return "/estudiantes/cursoEstudiantes.jsp";
		
	}
}
