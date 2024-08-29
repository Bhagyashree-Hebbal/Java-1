package com.xworkz.datatypes.runner;

import com.xworkz.datatypes.things.Abhishek;
import com.xworkz.datatypes.things.Bhumika;
import com.xworkz.datatypes.things.Lakshmi;
import com.xworkz.datatypes.things.Megha;
import com.xworkz.datatypes.things.Nayana;
import com.xworkz.datatypes.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		Megha megha = new Megha();
		megha.useWashingMachine();

		Lakshmi lakshmi = new Lakshmi();
		WashingMachine washingMachine = new WashingMachine("Bosch", "Front Load", 9);
		lakshmi.startWashing(washingMachine);

		WashingMachine washingMachine2 = new WashingMachine("IFB", "Top Load", 7);
		Abhishek abhishek = new Abhishek(washingMachine2);
		abhishek.displayWashingMachine();

		Bhumika bhumika = new Bhumika();
		WashingMachine ref = bhumika.createWashingMachine();
		if (ref != null) {
			ref.rinse();
			ref.show();
		} else {
			System.out.println("ref is null");
		}

		Nayana nayana = new Nayana();
		nayana.showWashingMachine();
	}

}
