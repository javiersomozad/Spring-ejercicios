package es.jsomoza.customvalidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;

@Documented
@Constraint(validatedBy = PostCodeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PostCodeConstraint {
    String message() default "Invalid PostCode";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}