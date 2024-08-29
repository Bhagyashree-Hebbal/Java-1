package com.xworkz.datatypes.things;

public class Book {
	private String title;
	private String author;
	private double price;

	public Book() {
		super();
		System.out.println("Created Book with no-args const...");
	}

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public void displayDetails() {
		System.out.println("running displayDetails");
	}

	public void updatePrice() {
		System.out.println("Title:" + title);
		System.out.println("Author:" + author);
		System.out.println("Price:" + price);
	}

}
