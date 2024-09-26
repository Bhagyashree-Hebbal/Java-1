package com.xworkz.events.exception;

public class InvalidAmountException extends RuntimeException {

	public InvalidAmountException() {
		super();
		System.out.println("running InvalidAmountException");
	}
}
