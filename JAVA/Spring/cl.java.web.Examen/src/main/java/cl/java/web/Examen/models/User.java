package cl.java.web.Examen.models;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.springframework.context.annotation.Role;

@Entity
@Table(name="users")
public class User{
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String password;
	@Transient
	private String passwordConf;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt;

@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "users_cursos")
joinColumns =

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(
//			name = "users_roles", 
//			joinColumns = @JoinColumn(name = "user_id"), 
//			inverseJoinColumns = @JoinColumn(name = "role_id"))
//	private List<Role> roles;

	public User() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return name;
	}
	public void setUsername(String username) {
		this.name = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConf;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConf = passwordConfirmation;
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
//	public List<Role> getRoles() {
//		return roles;
//	}
//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}

	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}


