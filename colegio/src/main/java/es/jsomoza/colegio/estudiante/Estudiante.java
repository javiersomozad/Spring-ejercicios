package es.jsomoza.colegio.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import es.jsomoza.colegio.asignatura.Asignatura;

@Component
public class Estudiante {
	@Value("Paul")
	private String name;
	@Value("1")
	private Integer course;
	
	@Autowired
	private Asignatura asignatura;
	
	public Estudiante () {}

	
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


	public Asignatura getAsignatura() {
		return asignatura;
	}


	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}


	@Override
	public String toString() {
		return "Estudiante [nombre=" + name + ", curso=" + course + ", asignatura=" + asignatura + "]";
	}
}
