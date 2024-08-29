package com.xworkz.datatypes.things;

public class Dboss {
	private Gun gun;

	public Dboss(Gun gun) {
		super();
		this.gun = gun;
	}

	public void showGun() {
		if (gun != null) {
			gun.fire();
			gun.display();
		} else {
			System.out.println("Gun is null");
		}
	}
}
