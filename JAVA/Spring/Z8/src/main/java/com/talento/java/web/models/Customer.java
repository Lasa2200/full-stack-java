package com.talento.java.web.models;


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
import javax.persistence.Table;






@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "pac_customer", 
			joinColumns = @JoinColumn(name = "customer_id"), 
			inverseJoinColumns = @JoinColumn(name = "pac_id")
			)
	private List<Pac> pac;


	public Customer() {

	}


	


	public Customer(Long id, String nombre, String apellido, Date createdAt, Date updatedAt, Date deletedAt,
			List<Pac> pac) {
	
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.pac = pac;
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


	public List<Pac> getPac() {
		return pac;
	}


	public void setPac(List<Pac> pac) {
		this.pac = pac;
	}
	
	
}