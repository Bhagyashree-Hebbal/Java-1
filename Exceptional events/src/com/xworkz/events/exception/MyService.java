package com.xworkz.events.exception;

public class MyService {

	public void saveEmail(String email) throws InvalidEmailException {
		if (email == null || !email.contains("@") || !email.contains(".")) {
			System.out.println("invalid data,will stop the execution");
			throw new InvalidEmailException();
		} else {
			System.out.println("Valid data will continue execution" + email);
		}
	}

	public void acceptPrice(double price) {
		if (price > 0 && price < 100) {
			System.out.println("Valid data will continue execution" + price);
		} else {
			System.out.println("Invalid data will continue execution");
			throw new InvalidAmountException();
		}
	}
}
