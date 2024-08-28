package com.xworkz.datatypes.things;

public class Car {
	public String brand = "Audi";
	public String model = "Audi Q5";

	public Car() {
		System.out.println("Created car using no-arg const..");
	}

	public void startEngine() {
		System.out.println("running startEngine in car");
	}

	public void stopEngine() {
		System.out.println("running stopEngine in car");
	}

	public void displayInfo() {
		System.out.println("running displayInfo in car");
	}
}
