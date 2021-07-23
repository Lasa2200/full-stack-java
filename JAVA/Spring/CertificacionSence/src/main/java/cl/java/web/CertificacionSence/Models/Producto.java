package cl.java.web.CertificacionSence.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="products")
public class Producto {
	
	@Id
	private Long product_id;
	private String product_name;
	private String description;
	private Integer standard_cost;
	private Integer list_price;
	private Long category_id;
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name="warehouse_id")
    @JsonIgnore
    private Producto producto;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    @JsonIgnore
    private CategoriaP categoriaP;

	public Producto() {
		super();
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStandard_cost() {
		return standard_cost;
	}

	public void setStandard_cost(Integer standard_cost) {
		this.standard_cost = standard_cost;
	}

	public Integer getList_price() {
		return list_price;
	}

	public void setList_price(Integer list_price) {
		this.list_price = list_price;
	}

	public Long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Long category_id) {
		this.category_id = category_id;
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

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public CategoriaP getCategoriaP() {
		return categoriaP;
	}

	public void setCategoriaP(CategoriaP categoriaP) {
		this.categoriaP = categoriaP;
	}
    
    
}