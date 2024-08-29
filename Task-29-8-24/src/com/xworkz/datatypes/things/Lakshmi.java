package com.xworkz.datatypes.things;

public class Lakshmi {
	public void startWashing(WashingMachine washingMachine) { // Parameter
		if (washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("WashingMachine is null");
		}
	}
}
