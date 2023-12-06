package es.jsomoza.colegio;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press any key to continue.");
		scanner.nextLine();
		System.out.println("aqui continua.");
		scanner.close();
		((ConfigurableApplicationContext) context).close();
	}

}
