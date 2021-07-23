package cl.java.web.DataII.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.DataII.Models.Estudiante;
import cl.java.web.DataII.Repositories.EstudianteRepository;

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

public Estudiante findById(Long id) {
	return estRepo.findById(id).orElse(null);
}
}
