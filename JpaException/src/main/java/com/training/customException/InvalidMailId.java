package com.training.customException;

public class InvalidMailId extends Exception{
	public InvalidMailId() {
		super("Please enter vaild emailformat");
	}

}
