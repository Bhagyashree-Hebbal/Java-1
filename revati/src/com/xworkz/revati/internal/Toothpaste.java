package com.xworkz.revati.internal;

public class Toothpaste {
	private String company;
	private boolean salt;

	public Toothpaste(String company) {
		this.company = company;
		System.out.println("running String const in Toothpaste");
	}

	public Toothpaste(String company, boolean salt) {
		this.company = company;
		this.salt = salt;
		System.out.println("running String,boolean const in Toothpaste");
	}

	public void display() {
		System.out.println("display from Toothpaste");
		System.out.println("Company:" + company);
		System.out.println("Salt:" + salt);
	}

}
