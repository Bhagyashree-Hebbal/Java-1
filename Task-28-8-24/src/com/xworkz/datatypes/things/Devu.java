package com.xworkz.datatypes.things;

public class Devu {
	public WaterBottle waterBottle;

	public void drop() {
		if (waterBottle != null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity);
			System.out.println(waterBottle.color);
		} else {
			System.out.println("WaterBottle is null");
		}
	}
}
