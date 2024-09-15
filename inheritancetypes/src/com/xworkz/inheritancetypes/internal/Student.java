package com.xworkz.inheritancetypes.internal;

//Hierarchical Inheritance
public class Student extends Person {
	public String major;

	public void study() {
		System.out.println(name + " is studying " + major + ".");
	}

}
