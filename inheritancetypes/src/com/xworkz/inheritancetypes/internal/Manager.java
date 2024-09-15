package com.xworkz.inheritancetypes.internal;

//Multilevel inheritance
public class Manager extends Employee {
	public String department;

	public void manageTeam() {
		System.out.println(name + " is managing the " + department + " department.");
	}
}
