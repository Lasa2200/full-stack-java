//package cl.java.web.Examen.models;
//
//
//
//import java.util.Date;
//import java.util.List;
//
//import javax.persistence.*;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//
//
//
//
//public class Cursos {
//
//
//	@Entity
//	@Table(name ="cursos")
//	public class cursos {
//
//		@Id
//		@GeneratedValue
//		private Long id;
//		private String name;
//
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//		public String getName() {
//			return name;
//		}
//
//		public void setName(String name) {
//			this.name = name;
//		}
//
//		public List<Cursos> getCursos() {
//			return cursos;
//		}
//
//		public void setCursos(List<Cursos> cursos) {
//			this.cursos = cursos;
//		}
//
//		public Integer getSignups() {
//			return Signups;
//		}
//
//		public void setSignups(Integer signups) {
//			Signups = signups;
//		}
//
//		public Date getUpdatedAt() {
//			return updatedAt;
//		}
//
//		public void setUpdatedAt(Date updatedAt) {
//			this.updatedAt = updatedAt;
//		}
//
//		@Column (columnDefinition ="TEXT",updatable=false)
//		private Date createdAt;
//		private Date updatedAt;
//
//		@ManyToMany(fetch = FetchType.LAZY)
//		@JoinTable(
//				name = "users_cursos", 
//				joinColumns = @JoinColumn(name = "user_id"), 
//				inverseJoinColumns = @JoinColumn(name = "curso_id"))
//		private List<Cursos> cursos;
//
//		@Min(0)
//		@Max(15)
//		private Integer Signups;
//	}
//	public Cursos() {
//	}
//
//}