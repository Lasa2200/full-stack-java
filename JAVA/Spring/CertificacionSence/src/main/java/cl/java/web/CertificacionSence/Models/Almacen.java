package cl.java.web.CertificacionSence.Models;


	import javax.persistence.Entity;
	import javax.persistence.Table;

	@Entity
	@Table(name="warehouses")
	public class Almacen {
		
		private Long wareHouse_id;
		private String warehouse_name;
		private Long location_id;
		

	}

