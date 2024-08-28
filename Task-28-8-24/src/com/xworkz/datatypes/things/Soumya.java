package com.xworkz.datatypes.things;

public class Soumya {

	public void goingTrip(Car car) {
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
