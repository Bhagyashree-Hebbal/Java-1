package com.xworkz.dataypes.things;

//6ways: IV,Local var,Static var,parameter,return,parent
public class Upendra {

	public void wear() {
		Hat hat = new Hat();// allocate-->copy IV-->default values-->invoke const-->chaining-->
		hat.shade();
		System.out.println(hat.color);
	}
}
