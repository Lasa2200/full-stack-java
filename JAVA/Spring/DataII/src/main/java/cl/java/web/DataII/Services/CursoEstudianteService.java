package cl.java.web.DataII.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.DataII.Models.CursoEstudiante;
import cl.java.web.DataII.Repositories.CursoEstudianteRepository;

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
