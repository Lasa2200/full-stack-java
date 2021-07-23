package com.talento.java.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.talento.java.web.models.PacCustomer;
import com.talento.java.web.repositories.PacCustomerRespository;


@Service
public class PacCustomerService {
	
	
		@Autowired
		private PacCustomerRespository ceRepo;
		
		public List<PacCustomer> findAllByPacId(Long id) {
			
			return ceRepo.findAllByPacId(id);
		}

		public void asociarPacCustomer(PacCustomer paccustomer) {
			ceRepo.save(paccustomer);
			
		}

		public List<PacCustomer> findAllByCustomerId(Long id) {
			return ceRepo.findAllByCustomerId(id);
			
		}

//		public List<Object[]> obtenerTodalaInformacion(Long id) {
//			return ceRepo.obtenerTodalaInformacion(id);
//		}

		public PacCustomer findById(Long id) {
			return ceRepo.findById(id).orElse(null);
		}
		
		public void eliminarPacCustomer(PacCustomer paccustomer) {
			 ceRepo.delete(paccustomer);
		}
	}