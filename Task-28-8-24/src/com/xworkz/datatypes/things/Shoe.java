package com.xworkz.datatypes.things;

public class Shoe {
	public String brand = "Bata";
	public double cost = 500;

	public Shoe() {
		System.out.println("Created Shoe using no-arg const..");
	}

	public void safeGuard() {
		System.out.println("running safeGuard in shoe");
	}

	public void enhanceWalk() {
		System.out.println("running enhanceWalk in shoe");
	}
}
