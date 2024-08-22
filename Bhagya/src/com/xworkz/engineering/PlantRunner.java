package com.xworkz.engineering;

public class PlantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant1 = new Plant("Rose", "Rosa", 2, 30.0, "Red", true, true, true, 1, 2.5);
		Plant plant2 = new Plant("Mango", "Mangifera indica", 5, 30.0, "Green", false, true, true, 2, 2.5);
		Plant plant3 = new Plant("Lotus", "Nelumbo nucifera", 1, 15.0, "Pink", true, true, true, 1, 3.5);

		Plant[] ref = new Plant[3];
		ref[0] = plant1;
		ref[1] = plant2;
		ref[2] = plant3;

		for (Plant plantDetails : ref) {
			System.out.println(plantDetails);
			plantDetails.print();
		}
	}
}
