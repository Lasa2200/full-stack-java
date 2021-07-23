package cl.java.web.CertificacionSence.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_categories")
public class CategoriaP {
	
	@Id
	private Long product_id;
	private Long warehouse_id;
	private Integer quantity;
	
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
    
}

