package com.xworkz.revati.internal;

public class Market {
	private String name;
	private String location;
	private String shops;
	private String type;

	public Market(String name) {
		this.name = name;
	}

	public Market(String name, String location, String shops, String type) {
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}

	public void display() {
		System.out.println("display from Market");
		System.out.println("Name:" + name);
		System.out.println("Location:" + location);
		System.out.println("Shops:" + shops);
		System.out.println("Type:" + type);
	}
}
