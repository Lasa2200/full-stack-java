package cl.java.web.ListaDeEstudiantes.Model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="License")
public class License {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
    
    public License() {
        
    }
}
