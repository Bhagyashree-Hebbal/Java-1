package com.xworkz.events.exception;

//un-checked exception OR RuntimeException
public class Watch extends RuntimeException {

	public Watch() {
		super();
		System.out.println("no-arg const in watch");
	}

}
