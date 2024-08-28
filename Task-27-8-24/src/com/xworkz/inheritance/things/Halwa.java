package com.xworkz.inheritance.things;

public class Halwa {
	public String flavor;
	public double sweetnessLevel;
	public boolean isHot;

	public Halwa() {
		System.out.println("Created Halwa");
	}

	public Halwa(String flavor, double sweetnessLevel, boolean isHot) {
		super();
		this.flavor = flavor;
		this.sweetnessLevel = sweetnessLevel;
		this.isHot = isHot;
	}

	public void eat() {
		System.out.println("running eat in Halwa");
	}

	public void describe() {
		System.out.println("running describe in Halwa");

	}
}
