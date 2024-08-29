package com.xworkz.datatypes.things;

public class BookShelf {
	private Book book;

	public BookShelf(Book book) {
		super();
		this.book = book;
	}

	public void showBookOnShelf() { // Instance variable
		if (book != null) {
			book.displayDetails();
			book.updatePrice();
		} else {
			System.out.println("book is null");
		}
	}
}
