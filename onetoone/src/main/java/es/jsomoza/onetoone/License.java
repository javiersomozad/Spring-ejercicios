package es.jsomoza.onetoone;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date since;
	private Integer years;
	
	@OneToOne(mappedBy = "license", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	Bar bar;
	
	public License () {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getSince() {
		return since;
	}

	public void setSince(Date since) {
		this.since = since;
	}

	public Integer getYears() {
		return years;
	}

	public void setYears(Integer years) {
		this.years = years;
	}

	@Override
	public String toString() {
		return "License [id=" + id + ", since=" + since + ", years=" + years + "]";
	}
}