package cl.java.web.DataII.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.DataII.Models.Curso;
import cl.java.web.DataII.Repositories.CursoRepository;



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
