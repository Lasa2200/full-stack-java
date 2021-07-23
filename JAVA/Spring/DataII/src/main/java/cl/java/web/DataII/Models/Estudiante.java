package cl.java.web.DataII.Models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;



@Entity
@Table (name="estudiantes")
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

public Estudiante(Long id, String nombre, String apellido, Integer edad, Date createdAt, Date updatedAt, Date deletedAt, List<Curso> cursos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
	this.deletedAt = deletedAt;
	this.cursos = cursos;
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

public List<Curso> getCursos() {
	return cursos;
}

public void setCursos(List<Curso> cursos) {
	this.cursos = cursos;
}
	
}
