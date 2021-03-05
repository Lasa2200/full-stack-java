//package cl.java.web.Examen.models;
//
//import java.util.Date;
//import java.util.List;
//import javax.persistence.*;
//
//
//@Entity
//@Table(name="instructor")
//public class Instructor {
//
//	@Id
//	@GeneratedValue
//	private Long id;
//	private String name;
//
//	@Column(columnDefinition ="Text")
//	private String description;
//	
//	@ManyToOne(fetch =FetchType.LAZY)
//	private User user;
//
//	@OneToMany(mappedBy="instructor",fetch=FetchType.LAZY)
//	private List<Cursos>cursos;
//
//
//	@Column(updatable =false)
//	private Date createdAt;
//	private Date updatedAt;
//
//	public Instructor() {
//
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public List<Cursos> getCursos() {
//		return cursos;
//	}
//
//	public void setCursos(List<Cursos> cursos) {
//		this.cursos = cursos;
//	}
//
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//	
//}
