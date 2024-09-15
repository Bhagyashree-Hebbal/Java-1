package com.xworkz.internal;

public class ExtremeAirtelInternetProvider extends AirtelInternetProvider {

	public ExtremeAirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of ExtremeAirtelInternetProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in ExtremeAirtelInternetProvider");
	}

}
