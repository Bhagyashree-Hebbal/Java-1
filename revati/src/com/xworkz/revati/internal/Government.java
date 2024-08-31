package com.xworkz.revati.internal;

public class Government {
	private String state;
	private int noOfMlas;
	private String partyHeadName;
	private String homeMinsterName;

	public Government(String state) {
		this.state = state;
	}

	public Government(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
		this.state = state;
		this.noOfMlas = noOfMlas;
		this.partyHeadName = partyHeadName;
		this.homeMinsterName = homeMinsterName;
	}

	public void display() {
		System.out.println("display from Market");
		System.out.println("State:" + state);
		System.out.println("No Of Mlas:" + noOfMlas);
		System.out.println("Party Head Name:" + partyHeadName);
		System.out.println("Home Minster Name:" + homeMinsterName);
	}
}
