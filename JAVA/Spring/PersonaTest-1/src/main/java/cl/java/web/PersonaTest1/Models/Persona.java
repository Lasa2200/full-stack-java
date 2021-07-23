package cl.java.web.PersonaTest1.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="personas")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	@Email(message="Email must be valid")
	private String email;
	private String telefono;	
	private Date createdAt;
    private Date updatedAt;

}
