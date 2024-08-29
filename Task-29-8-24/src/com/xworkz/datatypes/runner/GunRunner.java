package com.xworkz.datatypes.runner;

import com.xworkz.datatypes.things.Dboss;
import com.xworkz.datatypes.things.Godse;
import com.xworkz.datatypes.things.Gun;
import com.xworkz.datatypes.things.Police;
import com.xworkz.datatypes.things.Soldier;

public class GunRunner {

	public static void main(String[] args) {
		Soldier soldier = new Soldier();
		soldier.useGun();

		Police police = new Police();
		Gun gun = new Gun("AK-47", "India", "Rifle");
		police.carryGun(gun);

		Gun gun1 = new Gun("M16", "USA", "Assault Rifle");
		Dboss dboss = new Dboss(gun1);
		dboss.showGun();

		Godse godse = new Godse();
		Gun ref = godse.getGun();
		if (ref != null) {
			ref.fire();
			ref.display();
		} else {
			System.out.println("ref is null");
		}

	}

}
