package com.xworkz.datatypes.things;

public class Soldier {
	public void useGun() {
		Gun gun = new Gun("Glock 17", "Austria", "Pistol");
		gun.fire();
		gun.display();
	}
}
