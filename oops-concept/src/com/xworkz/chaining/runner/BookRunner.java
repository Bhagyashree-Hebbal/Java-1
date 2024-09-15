package com.xworkz.chaining.runner;

import com.xworkz.chaining.internal.Book;

public class BookRunner {

	public static void main(String[] args) {
		Book book1 = new Book("Java Programming");
		Book book2 = new Book("Python Programming", "John Doe");
		Book book3 = new Book("C++ Programming", "Jane Doe", 29.99);

	}

}
