package com.xworkz.chaining.internal;

public class Animal {
	String name;

	// Parent class constructor
	public Animal(String name) {
		this.name = name;
		System.out.println("Animal constructor called. Name: " + name);
	}
}

//1. super() Chaining
//The super() keyword is used to call the constructor of the parent class. This is useful when you want to initialize the parent class’s properties or perform some setup in the parent class before executing the child class’s constructor.