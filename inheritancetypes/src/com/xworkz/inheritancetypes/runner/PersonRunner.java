package com.xworkz.inheritancetypes.runner;

import com.xworkz.inheritancetypes.internal.Professor;
import com.xworkz.inheritancetypes.internal.Student;

//Hierarchical Inheritance
public class PersonRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "John";
		student.age = 20;
		student.major = "Computer Science";

		Professor professor = new Professor();
		professor.name = "Dr. Smith";
		professor.age = 45;
		professor.department = "Mathematics";

		student.introduce();
		student.study();

		professor.introduce();
		professor.teach();
	}

}
