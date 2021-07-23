package cl.java.web.DataII.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.DataII.Models.CursoEstudiante;


@Repository
public interface CursoEstudianteRepository  extends CrudRepository<CursoEstudiante, Long>{
	List<CursoEstudiante> findAll();

	List<CursoEstudiante> findAllByCursoId(Long id);
	
	List<CursoEstudiante> findAllByEstudianteId(Long id);
	
	@Query("select c.id,c.nombre, e.nombre, e.apellido , e.edad "
			+ "FROM CursoEstudiante ce "
			+ "JOIN ce.estudiante e JOIN ce.curso c "
			+ "where ce.curso.id = ?1 ")
	List<Object[]> obtenerTodalaInformacion(Long id);
}
