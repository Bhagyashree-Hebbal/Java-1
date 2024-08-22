package com.xworkz.engineering;

public class SnakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake1 = new Snake("cobra", 10, "poisonous");
		Snake snake2 = new Snake("Anaconda", 20, "poisonous");
		Snake snake3 = new Snake("Water snake", 8, "poisonous");

		Snake[] ref = new Snake[3];
		ref[0] = snake1;
		ref[1] = snake2;
		ref[2] = snake3;

		for (Snake snakeNames : ref) {
			System.out.println(snakeNames);
			snakeNames.print();
		}
	}
}
