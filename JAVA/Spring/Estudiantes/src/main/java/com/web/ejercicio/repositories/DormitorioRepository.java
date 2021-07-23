package com.web.ejercicio.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ejercicio.models.Dormitorio;

@Repository
public interface DormitorioRepository extends CrudRepository<Dormitorio, Long>{

	List<Dormitorio> findAll();
}
