package com.xworkz.encapsulation.Repository;

//Example to explain encapsulation 
public class Employee {
	private String name = "Bhagya";
	private int age = 22;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
