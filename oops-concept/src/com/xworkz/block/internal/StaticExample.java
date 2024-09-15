package com.xworkz.block.internal;

public class StaticExample {
	static int staticVar;

	// Static block
	static {
		staticVar = 10;
		System.out.println("Static block executed. staticVar = " + staticVar);
	}
}

//1. Static Block
//A static block is used for static initialization of a class. It is executed only once when the class is loaded into memory. Static blocks are useful for initializing static variables or performing tasks that need to be done once per class.