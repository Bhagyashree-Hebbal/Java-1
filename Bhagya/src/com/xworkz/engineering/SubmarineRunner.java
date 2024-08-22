package com.xworkz.engineering;

public class SubmarineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Submarine submarine1 = new Submarine("Oceangate", "USA", "Cylindrical", "invent", 20000);
		Submarine submarine2 = new Submarine("Arihant class", "india", "conical", "protect", 35000);
		Submarine submarine3 = new Submarine(" Type 039C", "china", "Cylindrical", "protect", 25000);

		Submarine[] submarine = new Submarine[3];

		submarine[0] = submarine1;
		submarine[1] = submarine2;
		submarine[2] = submarine3;

		for (Submarine ref : submarine) {
			System.out.println(ref);
			submarine1.calculate();
			submarine2.calculate();
			submarine3.calculate();
		}

	}

}
