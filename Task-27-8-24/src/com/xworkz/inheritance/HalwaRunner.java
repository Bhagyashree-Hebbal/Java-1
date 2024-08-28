package com.xworkz.inheritance;

import com.xworkz.inheritance.things.Halwa;
import com.xworkz.inheritance.things.MangoHalwa;

public class HalwaRunner {

	public static void main(String[] args) {

		MangoHalwa mangoHalwa1 = new MangoHalwa();
		mangoHalwa1.flavor = "Sweet";
		System.out.println(mangoHalwa1.flavor);
		mangoHalwa1.eat();
		mangoHalwa1.describe();

		Halwa halwa1 = new MangoHalwa();
		halwa1.flavor = "Ruchi";
		System.out.println(halwa1.flavor);
		halwa1.eat();
		halwa1.describe();

	}

}
