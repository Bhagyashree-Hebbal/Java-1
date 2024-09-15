package com.xworkz.inheritancetypes.runner;

import com.xworkz.inheritancetypes.internal.MathTeacher;

public class TeacherRunner {

	public static void main(String[] args) {
		MathTeacher mathTeacher = new MathTeacher();
		mathTeacher.name = "Mr. John";
		mathTeacher.age = 40;

		mathTeacher.teach();

		mathTeacher.solveMathProblem();
	}

}
