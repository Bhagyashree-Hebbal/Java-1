package com.xworkz.internal;

public class DellProvider extends Provider {

	public DellProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of DellProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in DellProvider");
	}
}
