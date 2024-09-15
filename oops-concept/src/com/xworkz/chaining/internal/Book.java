package com.xworkz.chaining.internal;

public class Book {
	String title;
	String author;
	double price;

	// Constructor with all parameters
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		System.out.println("Book constructor with all parameters called.");
	}

	// Constructor with two parameters
	public Book(String title, String author) {
		this(title, author, 0.0); // Calls the constructor with all parameters
		System.out.println("Book constructor with title and author called.");
	}

	// Constructor with one parameter
	public Book(String title) {
		this(title, "Unknown", 0.0); // Calls the constructor with all parameters
		System.out.println("Book constructor with title called.");
	}
}

//2. this() Chaining
//The this() keyword is used to call another constructor in the same class. This is useful for constructor chaining within the same class, allowing you to reuse constructor code and reduce redundancy.