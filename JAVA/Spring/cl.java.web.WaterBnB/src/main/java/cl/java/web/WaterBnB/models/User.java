package cl.java.web.WaterBnB.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="users")
public class User {
	
@Id
@GeneratedValue
private Long id;
private String firstName;
private String lastName;
private String email;
private String password;

@Transient// va en el modelo pero no en la base de datos
private String confirmpass;

@OneToMany(mappedBy ="user",fetch=FetchType.LAZY)
private List<Pool>pools;

@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
private List<Review>reviews;

@OneToOne(mappedBy="rol",fetch=FetchType.LAZY)
private Roles rol;

@Column(updatable=false)
private Date createdAt;
private Date updatedAt;

public User() {
	super();
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmpass() {
	return confirmpass;
}

public void setConfirmpass(String confirmpass) {
	this.confirmpass = confirmpass;
}

public List<Pool> getPools() {
	return pools;
}

public void setPools(List<Pool> pools) {
	this.pools = pools;
}

public List<Review> getReviews() {
	return reviews;
}

public void setReviews(List<Review> reviews) {
	this.reviews = reviews;
} 

public Roles getRol() {
	return rol;
}

public void setRol(Roles rol) {
	this.rol = rol;
}
@PrePersist
protected void onCreate() {
	this.createdAt =new Date();
	}
@PreUpdate
protected void onUpdate() {
	this.updatedAt = new Date();
}
}