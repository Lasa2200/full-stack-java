package com.talento.java.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talento.java.web.models.PacCustomer;

@Repository
public interface PacCustomerRespository extends CrudRepository<PacCustomer, Long>{

	List<PacCustomer> findAll();

	List<PacCustomer> findAllByCustomerId(Long id);
	
	List<PacCustomer> findAllByPacId(Long id);

//	List<Object[]> obtenerTodalaInformacion(Long id);
	
//	/*select c.id,c.nombre nombre_curso, e.nombre, e.apellido , e.edad
//	FROM cursos_estudiantes ce
//	inner join cursos c on ce.curso_id = c.id
//	inner join estudiantes e on ce.estudiante_id = e.id
//	where ce.curso_id = 1*/
//	
//	@Query("select c.id,c.nombre, e.nombre, e.apellido"
//			+ "FROM PacCustomer ce "
//			+ "JOIN ce.customer e JOIN ce.pac c "
//			+ "where ce.pac.id = ?1 ")

}
