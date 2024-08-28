package com.xworkz.inheritance.things;

public class Bull {
	public String breed;
	public int age;
	public double weight;
	public boolean isAggressive;
	public String color;

	public Bull() {
		System.out.println("Created Bull");
	}

	public Bull(String breed, int age, double weight, boolean isAggressive, String color) {
		super();
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.isAggressive = isAggressive;
		this.color = color;
	}

	public void charge() {
		System.out.println("running charge in bull");
	}

	public void graze() {
		System.out.println("running graze in bull");
	}

	public void snort() {
		System.out.println("running snort in bull");
	}

	public void sleep() {
		System.out.println("running sleep in bull");
	}

	public void displayColor() {
		System.out.println("running displayColor in bull");
	}
}
