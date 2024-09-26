package com.xworkz.events.service;

import com.xworkz.events.exception.Bicycle;

public class Smartphone {

	public void print(String bicycleName) throws Bicycle {
		System.out.println("running print in Smartphone");
		if (bicycleName == null || bicycleName.equals("")) {
			// stop the execution
			System.out.println("Invalid data,will stop the execution");
			throw new Bicycle();
		}
		// continue execution
		System.out.println("Valid data will continue execution");
	}
}
