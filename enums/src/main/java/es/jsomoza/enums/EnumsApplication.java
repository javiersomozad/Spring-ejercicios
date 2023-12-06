package es.jsomoza.enums;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnumsApplication  implements CommandLineRunner {
	 
	@Autowired
	 PlayerRepository playerRepository;
	 
	public static void main(String[] args) {
		SpringApplication.run(EnumsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		playerRepository.save(new Player("Arkonada",1, Position.GOALKEEPER));
		playerRepository.save(new Player("Pele",10, Position.FORWARD));
		playerRepository.save(new Player("Mesi",10, Position.FORWARD));
		playerRepository.save(new Player("Cruyff",4, Position.MIDFIELDER));
		playerRepository.save(new Player("Beckenbauer",4, Position.MIDFIELDER));
		
		System.out.println("Showing all players");
		for (Player p : playerRepository.findAll()) {
			System.out.println(p);
		}
		
		System.out.println("Showing all strikers");
		for (Player p : playerRepository.findByPosition(Position.FORWARD)) {
		   System.out.println(p);
		}
		
	}

}
