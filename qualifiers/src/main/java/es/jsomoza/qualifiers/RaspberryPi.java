package es.jsomoza.qualifiers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("raspb")
public class RaspberryPi implements Computer {

	@Override
	public void start() {
		System.out.println("I am a RaspberryPi ");

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
