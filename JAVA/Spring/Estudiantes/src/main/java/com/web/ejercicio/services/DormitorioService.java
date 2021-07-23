package com.web.ejercicio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.ejercicio.models.Dormitorio;
import com.web.ejercicio.repositories.DormitorioRepository;

@Service
public class DormitorioService {

	@Autowired
	private DormitorioRepository dorRepo;
	
	public Dormitorio insertarDormitorio(Dormitorio dormitorio) {
		
		return dorRepo.save(dormitorio);
	}
	
	public List<Dormitorio> listarDormitorios(){
		return dorRepo.findAll();
	}
	public Dormitorio obtenerDormitorio(Long id) {
		return dorRepo.findById(id).orElse(null);
	}

}
