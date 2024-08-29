package com.xworkz.datatypes.things;

public class Gun {
	private String name;
	private String countryMade;
	private String type;

	public Gun() {
		super();
		System.out.println("Created Gun with no-args const...");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void fire() {
		System.out.println("running fire");
	}

	public void display() {
		System.out.println("Name:" + name);
		System.out.println("CountryMade:" + countryMade);
		System.out.println("Type:" + type);
	}
}
