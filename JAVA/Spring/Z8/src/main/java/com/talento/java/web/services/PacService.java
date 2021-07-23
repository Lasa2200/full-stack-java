package com.talento.java.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.java.web.models.Pac;
import com.talento.java.web.repositories.PacRespository;

@Service
public class PacService {
	
			@Autowired
			private PacRespository pacRepo;
			
			public Pac insertarPac(Pac pac) {
				
				return pacRepo.save(pac);
			}			
								
			public List<Pac>listarPac(){
				
				return pacRepo.findAll();
			}
			
			
			public Pac obtenerPac(Long id) {
				return pacRepo.findById(id).orElse(null);
			}
				//new
			
			// encontrar un pac
			//Obteniendo la información de un pac
			public Pac findPac(Long id) {
				Optional<Pac> optionalPac = pacRepo.findById(id);
				if(optionalPac.isPresent()) {
					return optionalPac.get();
				} else {
					return null;
				}
			}
			
			
			
							//Actualizar y borrar un Pac
				public Pac updatePac(Long id) {

					return null;
				}
				public Pac updatePac(Pac b) {
					// TODO Auto-generated method stub
					return pacRepo.save(b);
				}
				public void deletePac(Long id) {
					// TODO Auto-generated method stub
					pacRepo.deleteById(id);
				}
		}

	

