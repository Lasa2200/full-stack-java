package cl.java.web.DataII.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.DataII.Models.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{
	List<Estudiante> findAll();
	
}
