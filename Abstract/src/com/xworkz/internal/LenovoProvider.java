package com.xworkz.internal;

public class LenovoProvider extends Provider {
	private double profit;

	public LenovoProvider(String name, String ceoName, double profit) {
		super(name, ceoName);
		this.profit = profit;
	}

	@Override
	public void service() {
		System.out.println("running service in LenovoProvider");
	}

	public void show() {
		System.out.println("Profit is:" + profit);
	}
}
