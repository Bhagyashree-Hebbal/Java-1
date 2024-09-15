package com.xworkz.tostringequals.runner;

import com.xworkz.tostringequals.internal.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		Kettle kettle1 = new Kettle("BrandA", "ModelX", 1.5);
		kettle1.setPower(1500);
		kettle1.setColor("Red");
		kettle1.setHasAutoShutoff(true);

		Kettle kettle2 = new Kettle("BrandB", "ModelY", 2, 1800, "Black", true);

		boolean check = kettle2.equals(kettle1);
		System.out.println("Kettle2 is same as kettle1:" + check);
	}

}
