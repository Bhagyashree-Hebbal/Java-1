package com.xworkz.revati.internal;

public class SuperMarket extends Market {
	public SuperMarket(String name, String location, String shops, String type) {
		super(name, location, shops, type);
		System.out.println("running string const in SuperMarket");
	}
}
