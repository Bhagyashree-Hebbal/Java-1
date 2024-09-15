package com.xworkz.internal;

public class InternetProvider extends Provider {

	public InternetProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of LenovoProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in InternetProvider");
	}
}
