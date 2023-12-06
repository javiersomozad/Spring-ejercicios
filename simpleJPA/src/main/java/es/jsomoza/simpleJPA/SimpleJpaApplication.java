package es.jsomoza.simpleJPA;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class SimpleJpaApplication implements CommandLineRunner {
	
	@Autowired
	DataSource dataSource;

	@Autowired
	TechnologyRepository technologyRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
	     System.out.println("DATASOURCE = " + dataSource);

	  	 technologyRepository.save(new Technology("Java", 1991));
	  	 technologyRepository.save(new Technology("Ruby", 1998));
	  	 technologyRepository.save(new Technology("JavaScript", 1993));
	  
	     System.out.println("Showing all records");
	     for (Technology technology : technologyRepository.findAll()) {
	       System.out.println(technology);
	     }

	     System.out.println("Select by creation date");
	     for (Technology technology : technologyRepository.findByCreationYear(1998)) {
	       System.out.println(technology);
	     }

	     System.out.println("Select by name with stream:");
	     technologyRepository
	      .findByNameReturnStream("%Java%")
	       .forEach( tech -> System.out.println(tech));
		
	}
}
