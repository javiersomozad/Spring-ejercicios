package es.jsomoza.ymlproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
public class MyPropertyConfig {
	
	@Value("${myapp.name}")
	private String name;
	
	@Value("${other.config.showDate}")
	private Boolean showDate;
	
	@Value("${logger.prefix}")
	private String prefix;
	
	@Bean
	public  Logger logger () {
		Logger logger =  new Logger();
		logger.setPrefix(name + prefix);
		logger.setShowDate(showDate);
		return logger;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties () {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer =
				new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
}
