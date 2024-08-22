package com.xworkz.engineering.river.store;

public class River {
	private String[] names = new String[7];
	private int index = 0;

	public void save(String name) {
		System.out.println("running save in River");
		this.names[this.index] = name;
		this.index++;
	}

	public void showNames() {
		System.out.println("running showNames in River");
		for (String name : this.names) {
			System.out.println("Name:" + name);
		}
	}
}
