package com.xworkz.practise.runner;

import com.xworkz.practise.internal.Footwear;

public class FootwearRunner {

	public static void main(String[] args) {
		Footwear footwear1 = new Footwear(5, "White");
		Footwear footwear2 = new Footwear(4, "Black");
		boolean check = footwear1.equals(footwear2);
		System.out.println("footwear2 is same as footwear1:" + check);
	}

}
