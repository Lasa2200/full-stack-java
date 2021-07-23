package com.web.ejercicio.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ejercicio.models.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{
	List<Estudiante> findAll();
	List<Estudiante> findAllByDormitorioId(Long id);
}
