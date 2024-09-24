package com.xworkz.encapsulation.Repository;

//Example to explain default methods in interface 
public interface Vehicle {
	void start();// Abstract method

	// dummy Implementation
	default void stop() { // Default method with implementation
		System.out.println("Vehicle stopped.");
	}
}
