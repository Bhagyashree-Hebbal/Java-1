package com.xworkz.inheritance;

import com.xworkz.inheritance.things.Bulb;
import com.xworkz.inheritance.things.Tubelight;

public class BulbRunner {

	public static void main(String[] args) {
		Tubelight tubelight1 = new Tubelight();
		tubelight1.volts = 45;
		System.out.println(tubelight1.volts);
		tubelight1.glow();

		Bulb bulb1 = new Tubelight();
		bulb1.volts = 60;
		System.out.println(bulb1.volts);
		bulb1.glow();

	}

}
