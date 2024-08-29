package com.xworkz.datatypes.things;

public class Library {
	public void addNewBook() {
		Book book = new Book("Malegalali Madumagalu", "Kuvempu", 200); // Local variable
		book.displayDetails();
		book.updatePrice();
	}
}
