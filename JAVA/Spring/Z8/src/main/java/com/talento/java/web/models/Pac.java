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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


@Entity
@Table(name="pac")
public class Pac {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombrePac;
	private Long costoPac;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "pac_customer", 
			joinColumns = @JoinColumn(name = "pac_id"), 
			inverseJoinColumns = @JoinColumn(name = "customer_id")
			)
	private List<Customer> customer;

	public Pac() {}
	
	
	

	public Pac(Long id, String nombrePac, Long costoPac, Date createdAt, Date updatedAt, List<Customer> customer) {
		
		this.id = id;
		this.nombrePac = nombrePac;
		this.costoPac = costoPac;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.customer = customer;
	}





	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.createdAt = new Date();
	}





	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getNombrePac() {
		return nombrePac;
	}





	public void setNombrePac(String nombrePac) {
		this.nombrePac = nombrePac;
	}





	public Long getCostoPac() {
		return costoPac;
	}





	public void setCostoPac(Long costoPac) {
		this.costoPac = costoPac;
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





	public List<Customer> getCustomer() {
		return customer;
	}





	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
}

