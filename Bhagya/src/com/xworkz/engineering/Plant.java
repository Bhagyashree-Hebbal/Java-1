package com.xworkz.engineering;

public class Plant {
	private String name;
	private String species;
	private int age;
	private double height;
	private String color;
	private boolean watered;
	private boolean fertilized;
	private boolean pruned;
	private int sunlightHours;
	private double growthRate;

	public Plant(String name, String species, int age, double height, String color, boolean watered, boolean fertilized,
			boolean pruned, int sunlightHours, double growthRate) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.height = height;
		this.color = color;
		this.watered = watered;
		this.fertilized = fertilized;
		this.pruned = pruned;
		this.sunlightHours = sunlightHours;
		this.growthRate = growthRate;
	}

	public void print() {
		System.out.println("Name:" + this.name);
		System.out.println("species:" + this.species);
		System.out.println("age:" + this.age);
		System.out.println("height:" + this.height);
		System.out.println("color:" + this.color);
		System.out.println("watered:" + this.watered);
		System.out.println("fertilized:" + this.fertilized);
		System.out.println("pruned:" + this.pruned);
		System.out.println("sunlightHours:" + this.sunlightHours);
		System.out.println("growthRate:" + this.growthRate);
	}
}
