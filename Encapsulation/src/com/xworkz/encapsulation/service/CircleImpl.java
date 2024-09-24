package com.xworkz.encapsulation.service;

import com.xworkz.encapsulation.Repository.Shapes;

public class CircleImpl implements Shapes {

	@Override
	public void draw() {
		System.out.println("Running draw");
	}

}
