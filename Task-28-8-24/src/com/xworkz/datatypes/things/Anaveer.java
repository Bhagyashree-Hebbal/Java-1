package com.xworkz.datatypes.things;

public class Anaveer {
	public Car car;

	public void exitCar() {
		if (car != null) {
			car.startEngine();
			car.stopEngine();
			car.displayInfo();
			System.out.println(car.brand);
			System.out.println(car.model);
		} else {
			System.out.println("Car is null");
		}
	}
}
