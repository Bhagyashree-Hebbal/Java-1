package com.xworkz.inheritance.things;

public class Chicken {
	public String breed;
	public int ageMonths;
	public double weightKg;
	public boolean isFreeRange;
	public String color;

	public Chicken() {
		System.out.println("Created Chicken");
	}

	public Chicken(String breed, int ageMonths, double weightKg, boolean isFreeRange, String color) {
		super();
		this.breed = breed;
		this.ageMonths = ageMonths;
		this.weightKg = weightKg;
		this.isFreeRange = isFreeRange;
		this.color = color;
	}

	public void layEgg() {
		System.out.println("running layEgg in Chicken");
	}

	public void cluck() {
		System.out.println("running cluck in Chicken");
	}

	public void scratchGround() {
		System.out.println("running scratchGround in Chicken");
	}

	public void feed() {
		System.out.println("running feed in Chicken");
	}

	public void displayColor() {
		System.out.println("running displayColor in Chicken");
	}
}
