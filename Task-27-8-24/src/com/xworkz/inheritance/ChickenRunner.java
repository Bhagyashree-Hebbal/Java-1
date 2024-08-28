package com.xworkz.inheritance;

import com.xworkz.inheritance.things.BroilerChicken;
import com.xworkz.inheritance.things.Chicken;

public class ChickenRunner {

	public static void main(String[] args) {
		BroilerChicken broilerChicken1 = new BroilerChicken();
		broilerChicken1.breed = "Hybrid";
		System.out.println(broilerChicken1.breed);
		broilerChicken1.layEgg();
		broilerChicken1.cluck();
		broilerChicken1.scratchGround();
		broilerChicken1.feed();
		broilerChicken1.displayColor();

		Chicken chicken1 = new Chicken();
		chicken1.breed = "Jawari";
		System.out.println(chicken1.breed);
		chicken1.layEgg();
		chicken1.cluck();
		chicken1.scratchGround();
		chicken1.feed();
		chicken1.displayColor();
	}

}
