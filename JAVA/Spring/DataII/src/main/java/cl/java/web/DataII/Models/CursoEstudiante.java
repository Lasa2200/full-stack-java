package cl.java.web.DataII.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="cursos_estudiantes")
public class CursoEstudiante {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(updatable=false)
private Date createdAt;
private Date updatedAt;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="estudiante_id")
@JsonIgnore
private Estudiante estudiante;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name="curso_id")
@JsonIgnore
private Curso curso;

public CursoEstudiante() {
	
}

public CursoEstudiante(Long id, Date createdAt, Date updatedAt, cl.java.web.DataII.Models.Estudiante estudiante,
		cl.java.web.DataII.Models.Curso curso) {
	super();
	this.id = id;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
	this.estudiante = estudiante;
	this.curso = curso;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public Estudiante getEstudiante() {
	return estudiante;
}

public void setEstudiante(Estudiante estudiante) {
	this.estudiante = estudiante;
}

public Curso getCurso() {
	return curso;
}

public void setCurso(Curso curso) {
	this.curso = curso;
}


}
