package com.xworkz.inheritance.things;

public class SmartPhone {
	public String brand;
	public String model;
	public int storageCapacityGB;
	public boolean isDualSIM;

	public SmartPhone() {
		System.out.println("Created SmartPhone");
	}

	public SmartPhone(String brand, String model, int storageCapacityGB, boolean isDualSIM) {
		this.brand = brand;
		this.model = model;
		this.storageCapacityGB = storageCapacityGB;
		this.isDualSIM = isDualSIM;
	}

	public void makeCall() {
		System.out.println("running makecall in SmartPhone");
	}

	public void takePhoto() {
		System.out.println("running takePhoto in SmartPhone");
	}
}
