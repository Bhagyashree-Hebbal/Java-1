package com.xworkz.Final.internal;

public final class Vehicle {

	private String type;

	public Vehicle(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

// This will cause a compile-time error
// public class Car extends Vehicle {
//	     public Car(String type) {
//	         super(type);
//	     }
// }

////////////
//The final keyword in Java is used to restrict the user from modifying classes, methods, and variables. Let’s explore how it works with classes and methods.

//1. Final with a Class
//When a class is declared as final, it cannot be subclassed. This is useful when you want to prevent inheritance to ensure that the class’s implementation remains unchanged.