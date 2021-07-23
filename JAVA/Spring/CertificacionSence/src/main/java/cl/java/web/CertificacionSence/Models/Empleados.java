package cl.java.web.CertificacionSence.Models;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Empleados {
	private Long employe_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String hire_date;
	private Long manager_id;
	private String job_title;
}

