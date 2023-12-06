package es.jsomoza.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class MyCustomBeanProcessor implements BeanPostProcessor, DestructionAwareBeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) 
    		throws BeansException {
   	 System.out.println("MyCustomProcessor> " + beanName 
   			 				+ " antes de la Inicialización. Type: " + bean.getClass()); 
       return bean;
   }
    
    public Object postProcessAfterInitialization(Object bean, String beanName) 
    		throws BeansException {
        System.out.println("MyCustomProcessor> "+ beanName 
        						+ " despues de la Iniciación. Type: " + bean.getClass());
        return bean;
    }
    
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println("MyDesturctorProcessor> "+ beanName 
				+ " justo antes de la destrucción. Type: " + bean.getClass());
	}
}
