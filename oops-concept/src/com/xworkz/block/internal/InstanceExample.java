package com.xworkz.block.internal;

public class InstanceExample {
	int instanceVar;

	// Instance block
	{
		instanceVar = 5;
		System.out.println("Instance block executed. instanceVar = " + instanceVar);
	}

	// Constructor
	public InstanceExample() {
		System.out.println("Constructor executed.");
	}

}

//2. Instance (Object/Class) Block
//An instance block, also known as an initializer block, is used to initialize instance variables. It is executed every time an instance of the class is created, before the constructor.