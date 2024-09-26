package com.xworkz.events.exception.runner;

import com.xworkz.events.exception.InvalidEmailException;
import com.xworkz.events.exception.MyService;

public class ExceptionRunner {

	public static void main(String[] args) throws InvalidEmailException {
		MyService myService = new MyService();
		System.out.println("running before save email");
		myService.saveEmail("bhagya@gmail.com");
		System.out.println("running after save email");

		System.out.println("running before accept Price");
		myService.acceptPrice(50);
		System.out.println("running after accept Price");
	}

}
