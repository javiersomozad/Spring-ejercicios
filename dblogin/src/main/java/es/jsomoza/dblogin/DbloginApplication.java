package es.jsomoza.dblogin;

import java.util.Set;
import java.util.HashSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import es.jsomoza.dblogin.domain.User;
import es.jsomoza.dblogin.repositories.UserRepository;

@SpringBootApplication
public class DbloginApplication {

	private static final Logger log = LoggerFactory.getLogger(DbloginApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DbloginApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// salva un usaurio.
			log.info("Se empieza a crear el usuario");
			log.info("-------------------------------");
			
			User user = new User();
			user.setUsername("usuario");
			user.setPassword(new BCryptPasswordEncoder().encode("1234"));
			user.setEmail("micorreo@gmail.com");
			user.setEnabled(true);
			user.setRole("ADMIN");
			
			repository.save(user);
			log.info("Usuario salvado");
		};
	}

}
