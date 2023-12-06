package es.jsomoza.qualifiers;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

	@Override
	public void start() {
		System.out.println("I am a Laptop ");
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
