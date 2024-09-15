package com.xworkz.internal;

public class Fast5gExtreme extends ExtremeAirtelInternetProvider {

	public Fast5gExtreme(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of Fast5gExtreme");
	}

	@Override
	public void service() {
		System.out.println("running service in Fast5gExtreme");
	}
}
