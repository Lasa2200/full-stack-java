package cl.java.web.WaterBnB.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name ="reviews")
public class Review {

@Id
@GeneratedValue
private Long id;

@Column (columnDefinition ="TEXT")


@Min(0)
@Max(5)
private Integer ranking;
}
