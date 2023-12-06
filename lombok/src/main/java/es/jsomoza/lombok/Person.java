package es.jsomoza.lombok;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude= {"directed","movies"})
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="director")  
	private List<Movie> directed = new ArrayList<Movie>();
	
	@ManyToMany(mappedBy = "cast")
	private List<Movie> movies = new ArrayList<Movie>();
	
	

	
}
