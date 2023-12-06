package es.jsomoza.javai18nspringboot;

import java.util.Locale;

import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Javai18nspringbootApplication implements WebMvcConfigurer {

	private final LocaleChangeInterceptor localeChangeInterceptor;
	
	public Javai18nspringbootApplication(LocaleChangeInterceptor localeChangeInterceptor) {
		this.localeChangeInterceptor = localeChangeInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(localeChangeInterceptor);
	}
	
	public static void main(String[] args) {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasenames("lang/messages");
	    messageSource.setDefaultEncoding("UTF-8");
	    System.out.println(messageSource.getMessage("hello", null, Locale.ITALIAN));
		SpringApplication.run(Javai18nspringbootApplication.class, args);
	}

}
