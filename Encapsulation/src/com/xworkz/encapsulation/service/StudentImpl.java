package com.xworkz.encapsulation.service;

import com.xworkz.encapsulation.Repository.College;

public class StudentImpl implements College {

	@Override
	public void noOfTeachers() {
		System.out.println("Running noOfTeachers");
	}

	@Override
	public void noOfStudents() {
		System.out.println("Running noOfStudents");
	}

}
