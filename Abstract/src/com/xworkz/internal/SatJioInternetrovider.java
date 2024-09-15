package com.xworkz.internal;

public class SatJioInternetrovider extends JioInternetProvider {
	private double cost;
	private String launchDate;

	public SatJioInternetrovider(String name, String ceoName, double cost, String launchDate) {
		super(name, ceoName);
		this.cost = cost;
		this.launchDate = launchDate;
	}

	@Override
	public void service() {
		System.out.println("running service in SatJioInternetrovider");
	}

	public void display() {
		System.out.println("Cost:" + cost);
		System.out.println("LaunchDate:" + launchDate);
	}
}
