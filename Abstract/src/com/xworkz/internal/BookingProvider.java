package com.xworkz.internal;

public class BookingProvider extends Provider {

	public BookingProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of BookingProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in BookingProvider");
	}
}
