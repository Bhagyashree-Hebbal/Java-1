package com.xworkz.revati.internal;

public class Train {
	private int no;
	private String source;
	private String destination;

	public Train(int no) {
		this.no = no;
	}

	public Train(int no, String source, String destination) {
		this.no = no;
		this.source = source;
		this.destination = destination;
	}

	public void display() {
		System.out.println("display from Train");
		System.out.println("No:" + no);
		System.out.println("Source:" + source);
		System.out.println("destination:" + destination);
	}
}
