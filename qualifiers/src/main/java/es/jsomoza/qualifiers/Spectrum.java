package es.jsomoza.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("spect")
public class Spectrum implements Computer {

	@Override
	public void start() {
		System.out.println("I am a Spectrum");

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
