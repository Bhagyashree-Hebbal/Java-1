package com.xworkz.events.exception;

//checked exception OR CompiletimeException
public class Bicycle extends Exception {

	public Bicycle() {
		super();
		System.out.println("no-arg const in Bicycle");
	}
}
