package es.jsomoza.lombok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class LombokApplication implements CommandLineRunner{
	
	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Showing all movies");
		for (Movie m : movieRepository.findAll()) {
			System.out.println(m);
		}
		System.out.println("Busqueda por titulo: Braveheart");
		for (Movie m : movieRepository.findByTitle("Braveheart")) {
			System.out.println(m);
		}

		movieRepository.deleteById(1L);
		System.out.println("despues de borrarlo");
		for (Movie m : movieRepository.findByTitle("Braveheart")) {
			System.out.println(m);
		}
		
		
	}
}
