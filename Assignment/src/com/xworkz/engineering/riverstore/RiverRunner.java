package com.xworkz.engineering.riverstore;

import com.xworkz.engineering.river.store.River;

public class RiverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		River river = new River();
		river.showNames();
		river.save("Kaveri");
		river.save("Krishna");
		river.save("Netravati");
		river.save("Tungabhadra");
		river.save("Sharavati");
		river.save("Hemavati");
		river.save("Bhima");
		river.showNames();
	}
}
