package com.xworkz.datatypes.things;

public class Abhishek {
	private WashingMachine washingMachine;

	public Abhishek(WashingMachine washingMachine) {
		super();
		this.washingMachine = washingMachine;
	}

	public void displayWashingMachine() {
		if (washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("WashingMachine is null");
		}
	}

}
