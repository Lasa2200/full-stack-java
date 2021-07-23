package cl.java.web.CertificacionSence.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import cl.java.web.CertificacionSence.Models.Inventario;
import cl.java.web.CertificacionSence.Models.Producto;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
	
	
}
	
	