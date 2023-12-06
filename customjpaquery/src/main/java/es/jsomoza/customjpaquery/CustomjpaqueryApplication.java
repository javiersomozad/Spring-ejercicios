package es.jsomoza.customjpaquery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class CustomjpaqueryApplication implements CommandLineRunner {
	
	 @Autowired
	 PlanetRepository planetRepository;

	public static void main(String[] args) {
		SpringApplication.run(CustomjpaqueryApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		  System.out.println("All: " + planetRepository.findAll());

		  System.out.println("By diam: " + planetRepository.findByBiggerThanPosition(200d));
		  
		  System.out.println("Bigger than: " + planetRepository.findByBiggerThan(300d));

		  System.out.println("Random: " + planetRepository.findRandom());
		  
		  System.out.println("Paginated: " + planetRepository.findPaginated(0,2));
		  
		  planetRepository.updateNameForDwarfs(300d);
		  System.out.println("Pluto: " + planetRepository.findByDiameter(234.3d));
		  planetRepository.deleteDwarfs();
		  System.out.println("Pluto? " + planetRepository.findByDiameter(234.3d));
		  
		  System.out.println("How many? " + planetRepository.countPlanets(0));
		
	}

}
