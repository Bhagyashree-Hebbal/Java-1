package com.xworkz.datatypes.runner;

import com.xworkz.datatypes.things.Book;
import com.xworkz.datatypes.things.BookFactory;
import com.xworkz.datatypes.things.BookShelf;
import com.xworkz.datatypes.things.BookStore;
import com.xworkz.datatypes.things.Library;

public class BookRunner {

	public static void main(String[] args) {
		Library library = new Library();
		library.addNewBook();

		BookStore bookStore = new BookStore();
		Book book = new Book("Chidambara Rahasya", "K.P. Poornachandra Tejaswi", 300);
		bookStore.sellBook(book);

		Book book2 = new Book("Parva", "S.L. Bhyrappa", 100);
		BookShelf bookShelf = new BookShelf(book2);
		bookShelf.showBookOnShelf();

		BookFactory bookFactory = new BookFactory();
		Book ref = bookFactory.createBook();
		if (ref != null) {
			ref.displayDetails();
			ref.updatePrice();
		} else {
			System.out.println("ref is null");
		}
	}

}
