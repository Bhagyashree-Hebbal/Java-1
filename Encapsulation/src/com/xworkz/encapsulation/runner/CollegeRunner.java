package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.service.StudentImpl;

public class CollegeRunner {

	public static void main(String[] args) {
		StudentImpl studentImpl = new StudentImpl();
		studentImpl.noOfTeachers();
		studentImpl.noOfStudents();
	}

}
