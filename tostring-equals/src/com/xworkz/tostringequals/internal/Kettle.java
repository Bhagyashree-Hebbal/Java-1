package com.xworkz.tostringequals.internal;

public class Kettle {
	private String brand;
	private String model;
	private double capacity; // in liters
	private double power; // in watts
	private String color;
	private boolean hasAutoShutoff;

	public Kettle(String brand, String model, double capacity, double power, String color, boolean hasAutoShutoff) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
		this.power = power;
		this.color = color;
		this.hasAutoShutoff = hasAutoShutoff;
	}

	public Kettle(String brand, String model, double capacity) {
		super();
		this.brand = brand;
		this.model = model;
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Kettle [brand=" + brand + ", model=" + model + ", capacity=" + capacity + ", power=" + power
				+ ", color=" + color + ", hasAutoShutoff=" + hasAutoShutoff + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals in Kettle");
		if (obj != null) {
			if (obj instanceof Kettle) {
				Kettle casted = (Kettle) obj;
				if (this.capacity == casted.capacity && this.brand.equals(casted.brand)
						&& this.model.equals(casted.model)) {
					System.out.println("left side is equal to right");
					return true;
				}
			} else {
				System.out.println("obj is not Kettle");
			}
		}
		return false;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHasAutoShutoff(boolean hasAutoShutoff) {
		this.hasAutoShutoff = hasAutoShutoff;
	}
}
