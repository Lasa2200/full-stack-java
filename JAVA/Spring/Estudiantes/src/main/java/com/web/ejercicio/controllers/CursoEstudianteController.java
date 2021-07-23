package com.web.ejercicio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.ejercicio.models.CursoEstudiante;
import com.web.ejercicio.models.Estudiante;
import com.web.ejercicio.services.CursoEstudianteService;
import com.web.ejercicio.services.CursoService;
import com.web.ejercicio.services.EstudianteService;

@Controller
public class CursoEstudianteController {
	@Autowired
	public CursoEstudianteService ceService;
	@Autowired
	CursoService cursoService;
	@Autowired
	public EstudianteService estuService;

	@PostMapping("/cursoestudiante/asociarCursoEstudiante")
	public String asociarCursoEstudiante(
			@ModelAttribute("cursoestudiante") CursoEstudiante cursoestudiante, Model model) {
		//solo para crear el registro
		ceService.asociarCursoEstudiante(cursoestudiante);
	
		return "redirect:/curso/"+cursoestudiante.getCurso().getId();
		
	}
	
	@PostMapping("/cursoestudiante/asociarEstudianteCurso")
	public String asociarEstudianteCurso(
			@ModelAttribute("cursoestudiante") CursoEstudiante cursoestudiante, Model model) {
		//solo para crear el registro
		ceService.asociarCursoEstudiante(cursoestudiante);
		
		return "redirect:/estudiante/"+ cursoestudiante.getEstudiante().getId();
		
	}
	
	@GetMapping("/remover/CursoEstudiante/{id}")
	public String removerCursoEstudiante(
			@PathVariable("id") Long id) {
		CursoEstudiante cursoEstudiante = ceService.findById(id);
		Long cursoId = cursoEstudiante.getCurso().getId();
	
		ceService.eliminarCursoEstudiante(cursoEstudiante);
		
		return "redirect:/curso/"+cursoId;
	}
	
	@GetMapping("/remover/EstudianteCurso/{id}")
	public String EstudianteCurso(
			@PathVariable("id") Long id) {
		CursoEstudiante cursoEstudiante = ceService.findById(id);
		Long estudianteId = cursoEstudiante.getEstudiante().getId();
		ceService.eliminarCursoEstudiante(cursoEstudiante);
		
		return "redirect:/estudiante/"+estudianteId;
	}
}
