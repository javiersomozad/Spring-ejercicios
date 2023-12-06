package es.jsomoza.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class Arduino implements Computer {
	private String version;
	
	public Arduino () {
		
	}
	
	public Arduino (String version) {
		this.version = version;
	}

	@Override
	public void start() {
		System.out.println("I am an Arduino " + version);
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub

	}

	@Override
	public void runProgram() {
		// TODO Auto-generated method stub

	}

}
