package es.jsomoza.simpleJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Integer creationYear;
	
	public Technology () {
		
	}

	public Technology(String name, Integer creationYear) {
		super();
		this.name = name;
		this.creationYear = creationYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCreationYear() {
		return creationYear;
	}

	public void setCreationYear(Integer creationYear) {
		this.creationYear = creationYear;
	}

	@Override
	public String toString() {
		return "Technology [id=" + id + ", name=" + name + ", creationYear=" + creationYear + "]";
	}
	
	
}