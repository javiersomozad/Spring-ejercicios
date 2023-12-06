package es.jsomoza.aopBasic;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PersonMonitor {
	
	@After("execution(public * *(..))")
	private void anyMethod() {
		System.out.println("Aspect> A method was called");
	}

}