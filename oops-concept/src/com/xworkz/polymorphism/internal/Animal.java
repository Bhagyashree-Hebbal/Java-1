package com.xworkz.polymorphism.internal;

public class Animal {
	// Method to be overridden
	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

//2. Run-Time Polymorphism
//Run-time polymorphism, also known as dynamic polymorphism, is resolved during the runtime. It is achieved through method overriding.

//Method Overriding Example
//Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.