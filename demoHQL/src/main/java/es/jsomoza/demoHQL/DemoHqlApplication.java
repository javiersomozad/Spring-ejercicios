package es.jsomoza.demoHQL;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class DemoHqlApplication implements CommandLineRunner {
	@Autowired
	DataSource dataSource;

	@Autowired
	UniversityDAO universityDAO;

	public static void main(String[] args) {
		SpringApplication.run(DemoHqlApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DATASOURCE = " + dataSource);

	    System.out.println("All: " + universityDAO.findAll());
	    
	     University university = universityDAO.findById(1L);
	     System.out.println("Found one: " + university);

	     University university2 = new University();
	     university2.setName("MIT");
	     university2.setMiyear(1945);
	     
//	     universityDAO.add(university2);
	     universityDAO.add(4,"MIT", 1945);
	     System.out.println("All: " + universityDAO.findAll());

	     System.out.println("By name: " + universityDAO.findByName("U"));
	     System.out.println("By name and year: " + universityDAO.search("UPV-EHU",1977));

	}

}
