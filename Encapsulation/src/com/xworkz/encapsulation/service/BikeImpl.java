package com.xworkz.encapsulation.service;

import com.xworkz.encapsulation.Repository.Vehicle;

public class BikeImpl {

	private Vehicle vehicle;

	public BikeImpl(Vehicle vehicle) {
		this.vehicle = vehicle;
		System.out.println("running BikeImpl");
	}

	public void speed() {
		if (vehicle != null) {
			vehicle.start();
		}
	}
}
