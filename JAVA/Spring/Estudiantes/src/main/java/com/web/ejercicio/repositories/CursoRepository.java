package com.web.ejercicio.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ejercicio.models.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

	List<Curso> findAll();
}
