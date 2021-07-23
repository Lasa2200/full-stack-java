package cl.java.web.CertificacionSence.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="customers")
public class Clientes {
	@Id
	private Long customer_id;
	private String name;
	private String adress;
	private String website;
	private Integer credit_limit;
	
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    @JsonIgnore
    private Ordenes ordenes;


	public Clientes() {
		super();
	}


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public Integer getCredit_limit() {
		return credit_limit;
	}


	public void setCredit_limit(Integer credit_limit) {
		this.credit_limit = credit_limit;
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


	public Ordenes getOrdenes() {
		return ordenes;
	}


	public void setOrdenes(Ordenes ordenes) {
		this.ordenes = ordenes;
	}
    
    
}
