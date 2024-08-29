package com.xworkz.datatypes;

import com.xworkz.dataypes.things.Hat;
import com.xworkz.dataypes.things.Rajkumar;
import com.xworkz.dataypes.things.Upendra;
import com.xworkz.dataypes.things.Yash;

public class HatRunner {

	public static void main(String[] args) {

		Upendra upendra = new Upendra();
		upendra.wear();// Hat-->shade(),color //local variable

		Yash yash = new Yash();
		Hat hat = new Hat();
		yash.tear(hat);// color,shade();//parameter

		Rajkumar rajkumar = new Rajkumar();// instance variable
		// rajkumar.hat=new hat;
		Hat hat2 = new Hat();
		rajkumar.hat = hat2;
		rajkumar.fold();

	}

}
