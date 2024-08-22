package com.xworkz.engineering.bikestore;

import com.xworkz.engineering.bike.store.Bike;

public class BikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.showNames();
		bike.save("Hero Honda");
		bike.save("Activa");
		bike.save("Royal Enfield");
		bike.save("Pulser");
		bike.save("Jupiter");
		bike.save("Suzuki");
		bike.save("Duo");
		bike.showNames();
	}

}
