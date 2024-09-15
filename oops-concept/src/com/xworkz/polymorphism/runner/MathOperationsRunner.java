package com.xworkz.polymorphism.runner;

import com.xworkz.polymorphism.internal.MathOperations;

public class MathOperationsRunner {

	public static void main(String[] args) {
		MathOperations math = new MathOperations();
		System.out.println(math.add(2, 3)); // Calls add(int, int)
		System.out.println(math.add(2, 3, 4)); // Calls add(int, int, int)
		System.out.println(math.add(2.5, 3.5)); // Calls add(double, double)

	}

}
