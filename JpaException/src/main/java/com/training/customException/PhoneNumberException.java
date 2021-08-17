package com.training.customException;

public class PhoneNumberException extends Exception {
	
	public PhoneNumberException() {
		super("Please provide valid Phone Number, it should contain minimun 10 numbers");
	}

}
