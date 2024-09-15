package com.xworkz.inheritancetypes.internal;

//Hierarchical Inheritance
public class Professor extends Person {
	public String department;

	public void teach() {
		System.out.println(name + " is teaching in the " + department + " department.");
	}
}
