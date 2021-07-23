package cl.java.web.CertificacionSence.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.java.web.CertificacionSence.Models.Almacen;
import cl.java.web.CertificacionSence.Repositories.AlmacenRepository;


@Service
public class AlmacenService {
	
		@Autowired
		private AlmacenRepository estRepo;
		
		
		
		public List<Almacen> obtenerTodosAlmacen(){
			return (List<Almacen>) AlmacenRepository.findAll();
		}

		
		
		
	}


