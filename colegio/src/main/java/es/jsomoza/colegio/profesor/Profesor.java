package es.jsomoza.colegio.profesor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profesor {
	@Value("W. White")
	private String name;

	@Value("ww@bluemeth.us")
	private String email;
	
	public Profesor () {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + name + ", email=" + email + "]";
	}
}
