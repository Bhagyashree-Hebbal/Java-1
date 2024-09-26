package com.xworkz.events.runner;

import com.xworkz.events.exception.Bicycle;
import com.xworkz.events.exception.Watch;

public class BicycleRunner {

	public static void main(String[] args) throws Bicycle {
		Bicycle bicycle = new Bicycle();
		throw bicycle;

		Watch watch = new Bicycle();
		throw watch;

	}

}
