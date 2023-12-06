package es.jsomoza.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.jsomoza.qualifiers.annotations.Cheap;
import es.jsomoza.qualifiers.annotations.Expensive;
import es.jsomoza.qualifiers.annotations.ComputerQ;

@SpringBootApplication
@Configuration
@ComponentScan({"es.jsomoza.qualifiers","es.jsomoza.qualifiers.annotations"})
public class Application implements CommandLineRunner {

	@Autowired
	@Qualifier("spect")
	private Computer computer1;
	
	@Autowired
	@Qualifier("raspb")
	private Computer computer2;
	
	@Autowired
	@Qualifier("arduino1")
	private Computer computer3;
	
	@Autowired
	@Qualifier("arduino2")
	private Computer computer4;

	@Autowired
	@Cheap
	private  Computer computer5;
	
	@Autowired
	@Expensive
	private  Computer computer6;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Starting some computers: ");
		computer1.start();
		computer2.start();
		computer3.start();
		computer4.start();
		computer5.start();
		computer6.start();

	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
