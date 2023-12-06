package es.jsomoza.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Platoon platoon = (Platoon) context.getBean("platoon");

		System.out.println("Platoon was created " + platoon);
		
		for (StormTrooper stromTrooper : platoon.getTroopers() ) {
			stromTrooper.getLogger().log(stromTrooper.getId()+" "+stromTrooper.getRank()+" presente");
		}
		
		((ConfigurableApplicationContext) context).close();
	}

}
