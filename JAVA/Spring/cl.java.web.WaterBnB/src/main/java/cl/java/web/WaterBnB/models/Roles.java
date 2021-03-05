package cl.java.web.WaterBnB.models;

import javax.persistence.*;


@Entity
@Table(name ="roles")
public class Roles {

@Id
@GeneratedValue
private Long id;
private String name;
}