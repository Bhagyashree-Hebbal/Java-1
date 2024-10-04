package com.xworkz.constants;

public enum TicketType {

	ONLINE(100), OFFLINE(200);

	private final int cost;

	private TicketType(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}
}
