package com.xworkz.engineering.citystore;

import com.xworkz.engineering.city.store.City;

public class CityRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city = new City();
		city.showNames();
		city.save("Kalburagi");
		city.save("Bangalore");
		city.save("Mysore");
		city.save("Hubballi");
		city.save("Darwad");
		city.save("Ramnagar");
		city.save("Belgavi");
		city.showNames();
	}

}
