package com.xworkz.practise.internal;

public class Footwear {
	private int size;
	private String color;

	public Footwear(int size, String color) {
		super();
		this.size = size;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Footwear");
		if (obj != null) {
			if (obj instanceof Footwear) {
				Footwear casted = (Footwear) obj;
				if (this.size == casted.size && this.color.equals(casted.color)) {
					System.out.println("left side is equals to right side");
					return true;
				} else {
					System.out.println("obj is not null");
				}
			} else {
				System.out.println("obj is null");
			}
		}
		return false;
	}
}
