package com.xworkz.encapsulation.runner;

import com.xworkz.encapsulation.Repository.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Soumya");
		employee.setAge(18);
		System.out.println(employee.getName());
		System.out.println(employee.getAge());
	}

}
