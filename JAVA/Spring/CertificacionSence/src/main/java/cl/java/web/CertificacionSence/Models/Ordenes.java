
 
package cl.java.web.CertificacionSence.Models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Ordenes {
	@Id
	private Long order_id;
	private Long customer_id;
	private String status;
	private Integer sales_man;
	private Integer order_date;
	
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;
}
