package com.xworkz.revati.internal;

public class OnlineMarket extends Market {
	public OnlineMarket(String name, String location, String shops, String type) {
		super(name, location, shops, type);
		System.out.println("running string const in OnlineMarket");
	}

}
