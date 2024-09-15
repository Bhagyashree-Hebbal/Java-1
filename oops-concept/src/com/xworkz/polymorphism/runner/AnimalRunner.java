package com.xworkz.polymorphism.runner;

import com.xworkz.polymorphism.internal.Animal;
import com.xworkz.polymorphism.internal.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal myDog = new Dog();
		myDog.sound(); // Calls the overridden method in Dog class

	}

}
