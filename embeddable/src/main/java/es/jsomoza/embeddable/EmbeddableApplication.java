package es.jsomoza.embeddable;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class EmbeddableApplication implements CommandLineRunner {
	
	 @Autowired
	 DataSource dataSource;

	 @Autowired
	 CustomerRepository customerRepository;


	public static void main(String[] args) {
		SpringApplication.run(EmbeddableApplication.class, args);
	}

	@Transactional
	 @Override
	public void run(String... args) throws Exception {
		
		  customerRepository.save(new Customer("John Doe","john@doe.me", new Address("Nowhere st",4)));
		  customerRepository.save(new Customer("Freddy Krueger","freddy@hell.no", new Address("Elm st",666)));
		  customerRepository.save(new Customer("Homer J. Simpson","hjsimpson@burns.co.us", new Address("Evergreen terrace",742)));
	
		  System.out.println("Showing all records");
		  for (Customer customer : customerRepository.findAll()) {
		   System.out.println(customer);
		  }

		  Customer anotherCustomer = new Customer("freddy", "f2@hell.com", new Address("address st", 1));
		  customerRepository.save(anotherCustomer);
		  
		  System.out.println("Select by name");
		  for (Customer customer : customerRepository.findByName("freddy")) {
		   System.out.println(customer);
		  }	
	}

}
