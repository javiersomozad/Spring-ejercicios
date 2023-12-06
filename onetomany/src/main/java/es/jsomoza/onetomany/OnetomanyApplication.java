package es.jsomoza.onetomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {
	
	@Autowired
	BrandRepository brandRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Showing all records");
		for (Brand brand : brandRepository.findAll()) {
			System.out.println(brand);
		}

		System.out.println("Select by name");
		for (Brand brand : brandRepository.findByName("LG")) {
			System.out.println(brand);
		}
		
	     System.out.println("Select by name with stream:");
	     brandRepository
	     .findByNameReturnStream("%msu%")
	     	.forEach( tech -> System.out.println(tech));

	}

}
