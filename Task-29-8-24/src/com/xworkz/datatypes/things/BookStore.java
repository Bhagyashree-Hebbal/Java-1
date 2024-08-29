package com.xworkz.datatypes.things;

public class BookStore {
	public void sellBook(Book book) { // Parameter
		if (book != null) {
			book.displayDetails();
			book.updatePrice();
		} else {
			System.out.println("book is null");
		}
	}
}
