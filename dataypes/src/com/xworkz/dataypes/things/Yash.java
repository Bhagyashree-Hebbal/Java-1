package com.xworkz.dataypes.things;

public class Yash {
	public void tear(Hat hat)// access var& methods
	{
		if (hat != null) {
			hat.shade();
			System.out.println(hat.color);
		} else {
			System.out.println("Hat is null");
		}
	}
}
