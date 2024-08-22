package com.xworkz.engineering;

public class Ball {
	private int size;
	private int weight;
	private int bounceCount;
	private int rollDistance;
	private String color;
	private String material;
	private boolean isInflated;
	private String brand;
	private double diameter;
	private String pattern;
	private int age;
	private int pressure;
	private String owner;
	private boolean isActive;
	private int temperature;
	private int gripLevel;
	private boolean isRepaired;
	private String type;
	private double circumference;
	private int spinRate;
	private boolean isUsed;
	private int quality;
	private int durability;
	private boolean isOnField;
	private String countryOfOrigin;
	private String shape;

	public Ball(int size, int weight, int bounceCount, int rollDistance, String color, String material,
			boolean isInflated, String brand, double diameter, String pattern, int age, int pressure, String owner,
			boolean isActive, int temperature, int gripLevel, boolean isRepaired, String type, double circumstances,
			int spinRate, boolean isUsed, int quality, int durability, boolean isOnField, String countryOfOrigin,
			String shape) {
		this.size = size;
		this.weight = weight;
		this.bounceCount = 0;
		this.rollDistance = 0;
		this.color = "Unknown";
		this.material = "Unknown";
		this.isInflated = true;
		this.brand = "Unknown";
		this.diameter = 0.0;
		this.pattern = "None";
		this.age = 0;
		this.pressure = 0;
		this.owner = "None";
		this.isActive = true;
		this.temperature = 0;
		this.gripLevel = 0;
		this.isRepaired = false;
		this.type = "Standard";
		this.circumference = 0.0;
		this.spinRate = 0;
		this.isUsed = false;
		this.quality = 0;
		this.durability = 0;
		this.isOnField = false;
		this.countryOfOrigin = "Unknown";
		this.shape = "Round";
	}

	public void display() {
		System.out.println("size:" + this.size);
		System.out.println("weight:" + this.weight);
		System.out.println("bounceCount:" + this.bounceCount);
		System.out.println("rollDistance:" + this.rollDistance);
		System.out.println("brand:" + this.brand);
		System.out.println("diameter:" + this.diameter);
		System.out.println("isInflated:" + this.isInflated);
		System.out.println("pattern:" + this.pattern);
		System.out.println("age:" + this.age);
		System.out.println("pressure:" + this.pressure);
		System.out.println("owner:" + this.owner);
		System.out.println("isActive:" + this.isActive);
		System.out.println("temperature:" + this.temperature);
		System.out.println("gripLevel:" + this.gripLevel);
		System.out.println("isRepaired:" + this.isRepaired);
		System.out.println("circumference:" + this.circumference);
		System.out.println("spinRate:" + this.spinRate);
		System.out.println("isUsed:" + this.isUsed);
		System.out.println("quality:" + this.quality);
		System.out.println("durability:" + this.durability);
		System.out.println("isOnField:" + this.isOnField);
		System.out.println("countryOfOrigin:" + this.countryOfOrigin);
		System.out.println("shape:" + this.shape);

	}
}
