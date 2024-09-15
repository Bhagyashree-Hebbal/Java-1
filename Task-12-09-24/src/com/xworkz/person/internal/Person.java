package com.xworkz.person.internal;

public class Person {
	String name;
	String email;
	int age;
	String mobileNo;

	// Constructor
	public Person(String name, String email, int age, String mobileNo) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	// Method to print person details
	//public void printDetails() {
	//	System.out.println("Name: " + name);
	//	System.out.println("Email: " + email);
	//	System.out.println("Age: " + age);
	//	System.out.println("Mobile No: " + mobileNo);
	//	System.out.println("-----------------------");
	//}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", mobileNo=" + mobileNo + "]";
	}
}
