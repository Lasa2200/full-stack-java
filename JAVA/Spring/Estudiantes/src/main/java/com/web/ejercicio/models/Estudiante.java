package com.web.ejercicio.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name="estudiantes")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private Integer edad;
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
	
    @OneToOne(mappedBy="estudiante", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Contacto contacto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dormitorio_id")
    private Dormitorio dormitorio;
    
   
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "cursos_estudiantes", 
        joinColumns = @JoinColumn(name = "estudiante_id"), 
        inverseJoinColumns = @JoinColumn(name = "curso_id")
    )
    private List<Curso> cursos;

	@PrePersist
    protected void onCreate() {
        setCreatedAt(new Date());
        setUpdatedAt(new Date());
    }

    @PreUpdate
    protected void onUpdate() {
        setUpdatedAt(new Date());
    }

	public Estudiante() {

	}

	public Estudiante(Long id, String nombre, String apellido, Integer edad, Date createdAt, Date updatedAt,
			Date deletedAt, Contacto contacto) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.contacto = contacto;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}
    public Dormitorio getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(Dormitorio dormitorio) {
		this.dormitorio = dormitorio;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
    
}
