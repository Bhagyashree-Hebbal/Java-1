package com.xworkz.inheritance;

import com.xworkz.inheritance.things.AndroidPhone;
import com.xworkz.inheritance.things.SmartPhone;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		AndroidPhone androidPhone1=new AndroidPhone();
		androidPhone1.brand="Samsung";
		System.out.println(androidPhone1.brand);
		androidPhone1.makeCall();
		androidPhone1.takePhoto();
		
		SmartPhone smartPhone1=new SmartPhone();
		smartPhone1.brand="Oppo";
		System.out.println(smartPhone1.brand);
		smartPhone1.makeCall();
		smartPhone1.takePhoto();

	}

}
