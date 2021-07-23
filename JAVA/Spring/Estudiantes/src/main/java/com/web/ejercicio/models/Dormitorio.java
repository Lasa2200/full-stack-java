package com.web.ejercicio.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dormitorios")
public class Dormitorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
    @OneToMany(mappedBy="dormitorio", fetch = FetchType.LAZY)
    private List<Estudiante> estudiantes;
    
    
    public Dormitorio() {}
    
	public Dormitorio(Long id, String nombre, List<Estudiante> estudiantes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estudiantes = estudiantes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
