package cl.java.web.lenguajes.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class LenguajeModel {
	@Entity
	@Table(name="lenguaje")
	public class Lenguaje {
	  
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Size(min = 2, max = 20)
	    private char nombre;
	    @Size(min = 2, max = 20)
	    private char creator;
	    @Size(min = 3, max = 40)
	    private char currentVersion;
	    @Min (1)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
		private Date createdAt;
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date updatedAt;
		
		public Lenguaje() {
			
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public char getNombre() {
			return nombre;
		}

		public void setNombre(char nombre) {
			this.nombre = nombre;
		}

		public char getCreator() {
			return creator;
		}

		public void setCreator(char creator) {
			this.creator = creator;
		}

		public char getCurrentVersion() {
			return currentVersion;
		}

		public void setCurrentVersion(char currentVersion) {
			this.currentVersion = currentVersion;
		}

	    
	    
	} 
	}


