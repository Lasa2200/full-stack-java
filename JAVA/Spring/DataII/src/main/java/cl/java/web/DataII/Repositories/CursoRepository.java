package cl.java.web.DataII.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.java.web.DataII.Models.Curso;



@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

	List<Curso> findAll();
}