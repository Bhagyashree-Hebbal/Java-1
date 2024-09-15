package com.xworkz.inheritancetypes.runner;

import com.xworkz.inheritancetypes.internal.Laptop;
import com.xworkz.inheritancetypes.internal.Smartphone;

public class ElectronicsRunner {

	public static void main(String[] args) {
		Smartphone smartphone = new Smartphone();
		smartphone.show();
		smartphone.apps();

		Laptop laptop = new Laptop();
		laptop.show();
		laptop.process();
	}

}
