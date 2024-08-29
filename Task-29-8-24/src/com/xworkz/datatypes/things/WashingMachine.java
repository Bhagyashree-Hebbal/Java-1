package com.xworkz.datatypes.things;

public class WashingMachine {
	private String brand;
	private String type;
	private int capacity;

	public WashingMachine() {
		super();
		System.out.println("Created WashingMachine with no-args const...");
	}

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void rinse() {
		System.out.println("running rinse");
	}

	public void show() {
		System.out.println("Brand:" + brand);
		System.out.println("Type:" + type);
		System.out.println("Capacity:" + capacity);
	}
}
