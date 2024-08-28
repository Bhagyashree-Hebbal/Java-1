package com.xworkz.inheritance;

import com.xworkz.inheritance.things.AngusBull;
import com.xworkz.inheritance.things.Bull;

public class BullRunner {

	public static void main(String[] args) {
		AngusBull angusBull1 = new AngusBull();
		//angusBull1.breed = "cow";
		angusBull1.age = 10;
		//angusBull1.weight = 100;
		//angusBull1.isAggressive = true;
		//angusBull1.color = "Black";
		System.out.println(angusBull1.age);
		angusBull1.charge();
		angusBull1.graze();
		angusBull1.snort();
		angusBull1.sleep();
		angusBull1.displayColor();

		Bull bull1 = new Bull();
		bull1.age = 20;
		System.out.println(bull1.age);
		bull1.charge();
		bull1.graze();
		bull1.snort();
		bull1.sleep();
		bull1.displayColor();
	}

}
