package jsomoza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldbootApplication implements CommandLineRunner {

	@Autowired
	private Country myCountry;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloworldbootApplication.class, args);
		System.out.println("termina el metodo main");
	}

	public void run(String... args) throws Exception {
		myCountry.setName("España");
		myCountry.setContinent("Europa");
		System.out.println("Se ha creado el pais : " + myCountry);
	}
}
