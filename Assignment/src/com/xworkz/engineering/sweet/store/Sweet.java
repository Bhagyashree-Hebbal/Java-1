package com.xworkz.engineering.sweet.store;

public class Sweet {
	private String[] names = new String[7];
	private int index = 0;

	public void save(String name) {
		System.out.println("running save in Sweet");
		this.names[this.index] = name;
		this.index++;
	}

	public void showNames() {
		System.out.println("running showNames in Sweeet");
		for (String name : this.names) {
			System.out.println("Name:" + name);
		}
	}
}
