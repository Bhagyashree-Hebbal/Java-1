package com.xworkz.holidays.internal;

public class Dancer {
	public void use(Belt belt) {
		belt.tie();

		if (belt instanceof LeatherBelt) {
			System.out.println("casting");
			LeatherBelt leatherBelt = (LeatherBelt) belt;
			leatherBelt.clip();
		}
	}
}
