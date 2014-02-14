package com.SpringMVC.common.Validator;
 
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.SpringMVC.common.service.Testhiber;
  
public class FormValidator implements Validator{
 
	@SuppressWarnings("rawtypes")
	@Override
	public boolean supports(Class clazz) {
		//just validate the Customer instances
		return Testhiber.class.isAssignableFrom(clazz);
	}
 
	@Override
	public void validate(Object target, Errors errors) {
 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id",
		     "ID is required", "Field ID is required.");
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "value",
			     "Value is required", "Field Value is required.");
 
	}
}