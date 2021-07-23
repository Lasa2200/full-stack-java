package com.web.ejercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.Contacto;
import com.web.ejercicio.repositories.ContactoRepository;

@Service
public class ContactoService {
	@Autowired
	private ContactoRepository contactoRepo;
	
	public Contacto insertarContacto(Contacto contacto) {
		
		return contactoRepo.save(contacto);
	}
	
	public List<Contacto> obtenerTodosContactos(){
		return contactoRepo.findAll();
	}

}
