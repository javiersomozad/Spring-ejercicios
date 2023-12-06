package es.jsomoza.colegio.asignatura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import es.jsomoza.colegio.profesor.Profesor;

@Component
public class Asignatura {
	@Value("Quimica")
	private String name;
	@Value("1")
	private Integer course;
	
	@Autowired
	private Profesor profesor;
	
	public Asignatura () {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + name + ", curso=" + course + ", profesor=" + profesor + "]";
	}

}
