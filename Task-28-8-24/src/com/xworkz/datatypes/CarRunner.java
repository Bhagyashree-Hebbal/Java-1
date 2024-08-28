package com.xworkz.datatypes;

import com.xworkz.datatypes.things.Anaveer;
import com.xworkz.datatypes.things.Bhagya;
import com.xworkz.datatypes.things.Car;
import com.xworkz.datatypes.things.Soumya;

public class CarRunner {

	public static void main(String[] args) {
		Bhagya bhagya = new Bhagya();
		bhagya.washable();

		Soumya soumya = new Soumya();
		Car car = new Car();
		soumya.goingTrip(car);

		Anaveer anaveer = new Anaveer();
		Car car2 = new Car();
		anaveer.car = car2;
		anaveer.exitCar();
	}

}
