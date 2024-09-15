package com.xworkz.internal;

public class JioInternetProvider extends InternetProvider {

	public JioInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running string const of JioInternetProvider");
	}

	@Override
	public void service() {
		System.out.println("running service in JioInternetProvider");
	}
}
