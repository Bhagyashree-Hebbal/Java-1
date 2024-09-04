package com.xworkz.practise.internal;

public class Raju {
	public void handleWeapon() {
		Weapon weapon = new Weapon();
		weapon.use();
		weapon.fire();
		System.out.println("running handleWeapon in Raju");
	}

	public void handleGun() {
		Gun gun = new Gun();
		gun.operate();
		System.out.println("running handleGun in Raju");
	}
}
