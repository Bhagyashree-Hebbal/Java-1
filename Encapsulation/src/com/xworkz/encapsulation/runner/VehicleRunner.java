package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Repository.CarImpl;
import com.xworkz.encapsulation.service.BikeImpl;

public class VehicleRunner {

	public static void main(String[] args) {
		BikeImpl bikeImpl = new BikeImpl(null);
		bikeImpl.speed();

		CarImpl carImpl = new CarImpl();
		carImpl.start();

	}

}
