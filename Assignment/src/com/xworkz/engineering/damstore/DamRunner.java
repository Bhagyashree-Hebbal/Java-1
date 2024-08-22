package com.xworkz.engineering.damstore;

import com.xworkz.engineering.dam.store.Dam;

public class DamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dam dam = new Dam();
		dam.showNames();
		dam.save("KRS Dam");
		dam.save("Almatti Dam");
		dam.save("Linganamakki Dam");
		dam.save("Tungabhadra Dam");
		dam.save("Bhadra Dam");
		dam.save("Hemavati Reservoir");
		dam.save("Kabini Reservoir ");
		dam.showNames();
	}
}
