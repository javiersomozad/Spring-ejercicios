package es.jsomoza.onetomany;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date since;
    
    @ManyToOne()
    @JoinColumn(name = "brand_id")
    private Brand brand;
	
	public Device () {}
	
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
	public Date getSince() {
		return since;
	}
	public void setSince(Date since) {
		this.since = since;
	}

	@Override
	public String toString() {
		return "\n\tDevice [id=" + id + ", name=" + name + ", since=" + since + "]";
	}
	
	
}