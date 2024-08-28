package com.xworkz.inheritance.things;

public class Bulb {
	public int volts;

	public Bulb() {
		System.out.println("Created bulb using no-arg const...");
	}

	public Bulb(int volts) {
		super();
		this.volts = volts;
	}

	public void glow() {
		System.out.println("running glow in bulb");
	}

}
