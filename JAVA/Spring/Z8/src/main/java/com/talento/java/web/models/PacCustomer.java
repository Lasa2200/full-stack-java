package com.talento.java.web.models;


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
@Table(name="pac_customer")
public class PacCustomer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customer_id")
	@JsonIgnore
	private Customer customer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pac_id")
	@JsonIgnore
	private Pac pac;

	public PacCustomer() {

	}

	public PacCustomer(Long id, Customer customer, Pac pac) {
		
		this.id = id;
		this.customer = customer;
		this.pac = pac;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Pac getPac() {
		return pac;
	}

	public void setPac(Pac pac) {
		this.pac = pac;
	}

	
}
