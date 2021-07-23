package cl.java.web.WaterBnB.models;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "reviews")
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(columnDefinition = "TEXT")
	private String review;
	
	@Min(0)
	@Max(5)
	private Integer rating;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updateAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Pool pool;
	
	public Review()
	{
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pool getPool() {
		return pool;
	}

	public void setPool(Pool pool) {
		this.pool = pool;
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
