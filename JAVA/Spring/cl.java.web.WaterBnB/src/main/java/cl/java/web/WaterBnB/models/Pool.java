package cl.java.web.WaterBnB.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "pool")
public class Pool {
	
	@Id
	@GeneratedValue
	private Long id;
	private String address;
	
	@Column(columnDefinition="TEXT")
	private String description;
	private Float cost;
	private String size;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updateAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@OneToMany(mappedBy="pool", fetch = FetchType.LAZY)
	private List<Review> reviews;
	
	public Pool()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	@PrePersist
	protected void onCreate()
	{
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() 
	{
		this.setUpdateAt(new Date());
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
}