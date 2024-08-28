package com.xworkz.datatypes.things;

public class WaterBottle {
	public int quantity = 5;
	public String color = "White";

	public WaterBottle() {
		System.out.println("Created WaterBottle using no-arg const..");
	}

	public void fill() {
		System.out.println("running fill in WaterBottle");
	}

	public void empty() {
		System.out.println("running empty in WaterBottle");
	}

	public void crush() {
		System.out.println("running crush in WaterBottle");
	}
}
