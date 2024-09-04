package com.xworkz.practise.internal;

public class Board {
	private String color;
	private double price;

	protected Board() {
		System.out.println("running Board using no-arg const");
	}

	public Board(String color, double price) {
		this.color = color;
		this.price = price;
		System.out.println("running String,double in Board");
	}

	public void play() {
		System.out.println("Color:" + color);
		System.out.println("Price:" + price);
	}

}
