package com.web.ejercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.Estudiante;
import com.web.ejercicio.repositories.EstudianteRepository;

@Service
public class EstudianteService {
	@Autowired
	private EstudianteRepository estRepo;
	
	public Estudiante agregarEstudiante(Estudiante estudiante) {
		
		return estRepo.save(estudiante);
	}
	
	public List<Estudiante> obtenerTodosEstudiantes(){
		return estRepo.findAll();
	}

	public List<Estudiante> findAllByDormitorioId(Long id){
		return estRepo.findAllByDormitorioId(id);
	}
	
	public Estudiante findById(Long id) {
		return estRepo.findById(id).orElse(null);
	}
}
