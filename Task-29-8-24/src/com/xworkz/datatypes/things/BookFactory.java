package com.xworkz.datatypes.things;

public class BookFactory {
	public Book createBook() { // Return type
		Book book = new Book("Mookajjiya Kanasugalu", "Shivarama Karanth", 500);
		return book;
	}
}
