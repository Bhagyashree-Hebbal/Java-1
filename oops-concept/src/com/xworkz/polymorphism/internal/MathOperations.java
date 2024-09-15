package com.xworkz.polymorphism.internal;

public class MathOperations {

	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}

	// Method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	// Method to add two double values
	public double add(double a, double b) {
		return a + b;
	}
}

//Polymorphism:-->
//Polymorphism in programming allows objects to be treated as instances of their parent class rather than their actual class. This concept is divided into two types: compile-time polymorphism and run-time polymorphism. Let’s explore both with examples.

//1. Compile-Time Polymorphism
//Compile-time polymorphism, also known as static polymorphism, is resolved during the compilation process. It is achieved through method overloading and operator overloading.

//Method Overloading Example
//Method overloading allows a class to have more than one method with the same name, but different parameters.
