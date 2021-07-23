package com.web.ejercicio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.web.ejercicio.models.CursoEstudiante;
import com.web.ejercicio.services.CursoEstudianteService;

@RestController
public class JsonController {
	
	@Autowired
	private CursoEstudianteService ceService;
	
	@GetMapping("/listar/estudianteCursos/{id}")
	public List<CursoEstudiante> listarEstudianteCursos(
			@PathVariable("id") Long id 
			){
		
		return ceService.findAllByEstudianteId(id);
	}
	
	@GetMapping("/listar/cursoEstudiante/{id}")
	public List<CursoEstudiante> listarCursoEstudiante(
			@PathVariable("id") Long id 
			){
		
		return ceService.findAllByCursoId(id);
	}
	
	
	@GetMapping("/obtenertodo/{id}")
	public List<Object[]> obtenerTodalaInformacion(
			@PathVariable("id") Long id 
			){
		
		return ceService.obtenerTodalaInformacion(id);
	}
	
}
