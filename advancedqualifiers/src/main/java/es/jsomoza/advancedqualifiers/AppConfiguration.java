package es.jsomoza.advancedqualifiers;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	@CustomerQualifier("normalCustomer")
    public Customer createNormal() {
        return new NormalCustomer();
    }

    @CustomerQualifier("importantCustomer")
    public Customer createImportant() {
        return new ImportantCustomer();
    }

}
