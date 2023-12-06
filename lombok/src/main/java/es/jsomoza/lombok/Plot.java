package es.jsomoza.lombok;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class Plot {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Lob
	private String description;

}
