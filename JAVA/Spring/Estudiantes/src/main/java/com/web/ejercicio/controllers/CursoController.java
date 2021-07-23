package com.web.ejercicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.ejercicio.models.Curso;
import com.web.ejercicio.models.CursoEstudiante;
import com.web.ejercicio.services.CursoEstudianteService;
import com.web.ejercicio.services.CursoService;
import com.web.ejercicio.services.EstudianteService;

@Controller
public class CursoController {
	@Autowired
	CursoService cursoService;
	@Autowired
	public EstudianteService estuService;

	@Autowired
	public CursoEstudianteService cursoEstudianteService;
	
	@GetMapping("/curso/crear")
	public String crearCurso(Model model) {
		model.addAttribute("curso", new Curso());
		return "/cursos/crearCursos.jsp";
	}
	
	@PostMapping("/curso/crear")
	public String insertarCurso(@ModelAttribute("curso") Curso curso) {
		cursoService.insertarCurso(curso);
		return "redirect:/home";
	}
	
	@GetMapping("/curso/listar")
	public String listarCursos(Model model) {
		model.addAttribute("listaCursos",cursoService.listarCursos());		
		return "/cursos/listarCursos.jsp";
	}
	
	@RequestMapping("/curso/{id}")
	public String asociarEstudianteCurso(
			@PathVariable("id") Long id, Model model
			) {
		
		model.addAttribute("curso",cursoService.obtenerCurso(id));
		
		model.addAttribute("listaEstudiantes", estuService.obtenerTodosEstudiantes());
		model.addAttribute("cursoestudiante",new CursoEstudiante());
		
		model.addAttribute("ListaCursoEstudiantes", cursoEstudianteService.findAllByCursoId(id));
		
		return "/cursos/cursoEstudiantes.jsp";
		
	}
}
