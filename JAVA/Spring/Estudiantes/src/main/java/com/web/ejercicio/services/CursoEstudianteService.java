package com.web.ejercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.CursoEstudiante;
import com.web.ejercicio.repositories.CursoEstudianteRepository;

@Service
public class CursoEstudianteService {
	@Autowired
	private CursoEstudianteRepository ceRepo;
	
	public List<CursoEstudiante> findAllByCursoId(Long id) {
		
		return ceRepo.findAllByCursoId(id);
	}

	public void asociarCursoEstudiante(CursoEstudiante cursoestudiante) {
		ceRepo.save(cursoestudiante);
		
	}

	public List<CursoEstudiante> findAllByEstudianteId(Long id) {
		return ceRepo.findAllByEstudianteId(id);
	}

	public List<Object[]> obtenerTodalaInformacion(Long id) {
		return ceRepo.obtenerTodalaInformacion(id);
	}

	public CursoEstudiante findById(Long id) {
		return ceRepo.findById(id).orElse(null);
	}
	
	public void eliminarCursoEstudiante(CursoEstudiante cursoEstudiante) {
		 ceRepo.delete(cursoEstudiante);
	}
}
