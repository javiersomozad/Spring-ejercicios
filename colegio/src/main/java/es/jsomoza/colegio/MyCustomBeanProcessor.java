package es.jsomoza.colegio;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyCustomBeanProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	   	 System.out.println("MyCustomProcessor> " + beanName 
	   			 + " llamada a postProcessBeforeInitializationwas instantiated. Type: " 
	   			 + bean.getClass()); 
	   	 System.out.println("\tDump: " + bean);
	       return bean;
	   }
	    
	    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	        System.out.println("MyCustomProcessor> "+ beanName 
	        		+ " llamada a postProcessAfterInitialization. Type: " 
	        		+ bean.getClass());
	      	 System.out.println("\tDump: " + bean);
	        return bean;
	    }

}
