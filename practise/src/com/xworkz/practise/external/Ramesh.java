package com.xworkz.practise.external;

import com.xworkz.practise.internal.Gun;
import com.xworkz.practise.internal.Weapon;

public class Ramesh {
	public void handleWeapon() {
		Weapon weapon = new Weapon();

		weapon.fire();
		System.out.println("running handleWeapon in Ramesh");
	}

	public void handleGun() {
		Gun gun = new Gun();
		gun.operate();
		System.out.println("running handleGun in Ramesh");
	}
}
