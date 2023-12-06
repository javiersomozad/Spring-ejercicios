package es.jsomoza.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongdbApplication implements CommandLineRunner {

	@Autowired
	private NoteRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();

		repository.save(new Note("No olvides aprender Spring5"));
		  repository.save(new Note("No olvides aprender MongoDB"));
		  repository.save(new Note("No olvides aprender Java17"));
		  
		  for (Note n : repository.findAll()) {
		   System.out.println(n);
		  }
		  System.out.println();

		  System.out.println("Single");
		  System.out.println(repository.findByText("No olvides aprender MongoDB"));

		
	}

}
