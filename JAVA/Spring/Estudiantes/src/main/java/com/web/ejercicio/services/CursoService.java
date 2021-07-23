package com.web.ejercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.Curso;
import com.web.ejercicio.repositories.CursoRepository;

@Service
public class CursoService {
	@Autowired
	CursoRepository cursoRepo;
	
	public Curso insertarCurso(Curso curso) {
		
		return cursoRepo.save(curso);
	}

	public List<Curso> listarCursos() {
		
		return cursoRepo.findAll();
	}

	public Curso obtenerCurso(Long id) {
		return cursoRepo.findById(id).orElse(null);
	}

}
