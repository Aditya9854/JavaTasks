package com.sp.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumber,String> {

	@Override
	public boolean isValid(String contactField, ConstraintValidatorContext context) {
		// returns true if the string is exactly 10 digits
		return contactField != null && contactField.matches("^[0-9]{10}$");
	}

}
