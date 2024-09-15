package com.xworkz.internal;

public class AirtelInternetProvider extends InternetProvider {

	public AirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of AirtelInternetProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in AirtelInternetProvider");
	}
}
