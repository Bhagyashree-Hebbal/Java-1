package com.xworkz.Final.internal;

public class Animal {
	public final String breed = "German Shepherd";

	public final void sound() {
		System.out.println("This is a generic animal sound.");
	}
}

//2. Final with a Method
//When a method is declared as final, it cannot be overridden by subclasses. This is useful when you want to ensure that the method’s behavior remains consistent across all subclasses.