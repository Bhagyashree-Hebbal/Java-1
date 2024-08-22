package com.xworkz.engineering.city.store;

public class City {
	private String[] names = new String[7];
	private int index = 0;

	public void save(String name) {
		System.out.println("running save in City");
		this.names[this.index] = name;
		this.index++;
	}

	public void showNames() {
		System.out.println("running showNames in City");
		for (String name : this.names) {
			System.out.println("Name:" + name);
		}
	}
}
