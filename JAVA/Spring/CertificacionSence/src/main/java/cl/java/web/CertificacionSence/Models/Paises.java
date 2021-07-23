package cl.java.web.CertificacionSence.Models;

	import javax.persistence.Entity;
	import javax.persistence.Table;

	@Entity
	@Table(name="countries")
	public class Paises {
		
		private Long country_id;
		private String country_name;
		private Long región_id;
	}

