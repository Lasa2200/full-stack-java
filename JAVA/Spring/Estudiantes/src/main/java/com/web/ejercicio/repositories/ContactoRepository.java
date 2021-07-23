package com.web.ejercicio.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ejercicio.models.Contacto;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Long>{
	
	List<Contacto> findAll();

}
