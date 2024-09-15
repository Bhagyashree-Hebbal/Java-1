package com.xworkz.inheritancetypes.internal;

//Single inheritance
public class MathTeacher extends Teacher {
	String subject = "Mathematics";

	public void solveMathProblem() {
		System.out.println(name + " is solving a math problem.");
	}
}
