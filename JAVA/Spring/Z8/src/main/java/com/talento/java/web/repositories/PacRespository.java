package com.talento.java.web.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.talento.java.web.models.Pac;




@Repository
public interface  PacRespository extends CrudRepository<Pac, Long>{

	List<Pac> findAll();
	
	//nuevos
	
   	//Este metodo borra un libro por id
	void deleteById(Long id);

}


