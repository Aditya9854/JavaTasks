package com.sp.validation.validator;

import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ContactNumberValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ContactNumber {
	
	    String message() default "Invalid phone number: must be 10 digits";
	    Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};

}
