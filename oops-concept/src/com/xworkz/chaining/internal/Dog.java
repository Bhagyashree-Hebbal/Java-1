package com.xworkz.chaining.internal;

public class Dog extends Animal {
	String breed;

	// Child class constructor
	public Dog(String name, String breed) {
		super(name); // Calls the parent class constructor
		this.breed = breed;
		System.out.println("Dog constructor called. Breed: " + breed);
	}
}
