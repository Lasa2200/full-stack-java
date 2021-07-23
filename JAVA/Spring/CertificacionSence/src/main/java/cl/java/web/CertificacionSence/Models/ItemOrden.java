package cl.java.web.CertificacionSence.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_items")
public class ItemOrden {

	@Id
	private Long order_id;
	private Long item_id;
	private Long product_id;
	private Integer quantity;
	private Integer unit_price;
	
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
