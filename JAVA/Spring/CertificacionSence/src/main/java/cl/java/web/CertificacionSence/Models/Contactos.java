package cl.java.web.CertificacionSence.Models;
	import javax.persistence.Entity;
	import javax.persistence.Table;

	@Entity
	@Table(name="contacts")
	public class Contactos {

			private Long contact_id;
			private String first_name;
			private String last_name;
			private String email;
			private String phone;		
			private Long customer_id;
		
	}

