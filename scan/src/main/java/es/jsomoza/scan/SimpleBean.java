package es.jsomoza.scan;

import org.springframework.stereotype.Component;

@Component
public class SimpleBean {
	public String doStuff () {
		return "This is a Simple Bean";
	}
}
