package com.xworkz.revati.internal;

public class StateGovernment extends Government {
	public StateGovernment(String state, int noOfMlas, String partyHeadName, String homeMinsterName) {
		super(state, noOfMlas, partyHeadName, homeMinsterName);
		System.out.println("running string const in StateGovernment");
	}
}
