package com.web.ejercicio.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ejercicio.models.CursoEstudiante;

@Repository 
public interface CursoEstudianteRepository extends CrudRepository<CursoEstudiante, Long>{
	
	List<CursoEstudiante> findAll();

	List<CursoEstudiante> findAllByCursoId(Long id);
	
	List<CursoEstudiante> findAllByEstudianteId(Long id);
	
	/*select c.id,c.nombre nombre_curso, e.nombre, e.apellido , e.edad
	FROM cursos_estudiantes ce
	inner join cursos c on ce.curso_id = c.id
	inner join estudiantes e on ce.estudiante_id = e.id
	where ce.curso_id = 1*/
	
	@Query("select c.id,c.nombre, e.nombre, e.apellido , e.edad "
			+ "FROM CursoEstudiante ce "
			+ "JOIN ce.estudiante e JOIN ce.curso c "
			+ "where ce.curso.id = ?1 ")
	List<Object[]> obtenerTodalaInformacion(Long id);
}

