package com.xworkz.engineering.sweetstore;

import com.xworkz.engineering.sweet.store.Sweet;

public class SweetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sweet sweet = new Sweet();
		sweet.showNames();
		sweet.save("Gulab Jamun");
		sweet.save("Jalebi");
		sweet.save("Ladoo");
		sweet.save("Rasgulla");
		sweet.save("Barfi");
		sweet.save("Kaju Katli");
		sweet.save("Peda");
		sweet.showNames();
	}
}
