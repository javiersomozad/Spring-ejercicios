package es.jsomoza.onetoone;

import java.util.*;
import java.text.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;


@SpringBootApplication
public class OnetooneApplication  implements CommandLineRunner{
	
	@Autowired
	BarRepository barRepository;

	@Autowired
	LicenseRepository licenseRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

	@Transactional
	@Override
	public void run(String... args) throws Exception {
		 License license = new License();
		 
		 System.out.println("Showing all records");
	     for (Bar bar1 : barRepository.findAll()) {
	       System.out.println(bar1);
	     }
	     
	     System.out.println("Select by name");
	     for (Bar bar1 : barRepository.findByName("Bar Buerto")) {
	       System.out.println(bar1);
	     }

	     System.out.println("Select by license");
	     license.setId(3L);
	     System.out.println(barRepository.findByLicense(license));
	     
	     System.out.println("Aqui empieza la prueba...");
	     Bar bar = new Bar();
	     bar.setId(1L);
	     System.out.println(licenseRepository.findByBar(bar));
	     
	     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	     license.setSince(dateformat.parse("2023-06-20"));
	     for (License li : licenseRepository.findBySince(dateformat.parse("2008-01-12"))) {
		       System.out.println(li);
		     }
	     
	     /*
	     System.out.println("Aqui empieza la prueba...");
	     Bar bar = new Bar();
	     bar.setName("Mi propio bar");
	     bar.setAddress("calle melancolia");
	     license = new License();
	     SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	     license.setSince(dateformat.parse("2023-06-20"));
	     license.setYears(10);
	     bar.setLicense(license);
	     barRepository.save(bar);
	     
	     for (Bar bar1 : barRepository.findAll()) {
		       System.out.println(bar1);
		 }
		 */
	}

}
