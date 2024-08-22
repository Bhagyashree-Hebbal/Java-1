package com.xworkz.engineering;

public class BallRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ball ball1 = new Ball(10, 20, 20, 30, "red", "rubber", false, "ola", 24, "cricket", 20, 30, "kohli", true, 56,
				10, true, "football", 34, 12, false, 23, 45, true, "india", "round");
		Ball ball2 = new Ball(15, 25, 12, 13, "black", "plastic", true, "volvo", 23, "volleyball", 23, 45, "rohit",
				false, 34, 56, true, "basketball", 32, 13, true, 14, 34, true, "karnataka", "oval");
		Ball ball3 = new Ball(20, 30, 15, 45, "pink", "steel", false, "tcs", 34, "basketball", 24, 45, "dhoni", false,
				34, 13, true, "hockey", 23, 26, true, 15, 25, false, "andhra", "circle");

		Ball[] balls = {ball1, ball2, ball3};

        
        for (Ball ball : balls) {
			System.out.println(balls);
			ball1.display();
			ball2.display();
			ball3.display();
		}
	}
}
