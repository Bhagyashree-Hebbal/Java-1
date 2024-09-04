package com.xworkz.practise.external;

import com.xworkz.practise.internal.Board;

public class CarromBoard extends Board {
	public CarromBoard(String color, double price) {
		super(color, price);
		System.out.println("running String,double in CarromBoard");
	}

}
