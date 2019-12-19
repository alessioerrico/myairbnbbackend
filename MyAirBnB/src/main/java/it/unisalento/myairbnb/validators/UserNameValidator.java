package it.unisalento.myairbnb.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserDTONameConstrains, String> {
	
	String name;
	
	@Override
	public void initialize(UserDTONameConstrains constraintAnnotation) {
		// TODO Auto-generated method stub
		ConstraintValidator.super.initialize(constraintAnnotation);
		name= constraintAnnotation.name();
		}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(value.equals(name))
			
			return false;
		else return true;
		
	}

}
