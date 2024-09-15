package com.xworkz.person.runner;

import com.xworkz.person.internal.Person;

public class PersonRunner {

	public static void main(String[] args) {
		// Step 1: Create 5 copies of Person
		Person person1 = new Person("Bhagyashree", "bhagyahebbal@gmail.com", 21, "1234567890");
		Person person2 = new Person("Shantamma", "shantammasirgan@gmail.com", 22, "2345678901");
		Person person3 = new Person("Soumya", "soumyahebbal@gmail.com", 18, "3456789012");
		Person person4 = new Person("Sohita", "sohitapatil@gmail.com", 23, "4567890123");
		Person person5 = new Person("Renuka", "renukakalal@gmail.com", 22, "5678901234");

		// Step 2: Create an array of Person and add the 5 copies
		Person[] persons = { person1, person2, person3, person4, person5 };

		// Step 3: Use forEach to print all the details of each person
		for (Person person : persons) {
			System.out.println(person);
			//person.printDetails();
		}

	}

}
