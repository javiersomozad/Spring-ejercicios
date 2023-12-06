package es.jsomoza.i18nvalidation;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@SpringBootApplication
public class I18nvalidationApplication implements WebMvcConfigurer {
	
	private final LocaleChangeInterceptor localeChangeInterceptor;
	
	public I18nvalidationApplication(LocaleChangeInterceptor localeChangeInterceptor) {
		this.localeChangeInterceptor = localeChangeInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry interceptorRegistry) {
		interceptorRegistry.addInterceptor(localeChangeInterceptor);
	}

	public static void main(String[] args) {
		
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.setBasenames("messages");
	    messageSource.setDefaultEncoding("UTF-8");
	    System.out.println(messageSource.getMessage("hello", null, Locale.ENGLISH));
		SpringApplication.run(I18nvalidationApplication.class, args);
	}

}
