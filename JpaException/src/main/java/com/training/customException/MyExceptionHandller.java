package com.training.customException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandller {
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionForNull() {
		return "entered null key";

	}

	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionNumberFormat() {
		return "please ented valed number fromt";

	}

	@ExceptionHandler(value = InvalidMailId.class)
	public ResponseEntity<Object> customEmailExp(InvalidMailId invalid) {

		return new ResponseEntity<>(invalid.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

	}
	
	
	@ExceptionHandler(value = PhoneNumberException.class)
	public ResponseEntity<Object> customNumExp(PhoneNumberException invalid) {

		return new ResponseEntity<>(invalid.getLocalizedMessage(), HttpStatus.BAD_REQUEST);

	}
	

}
