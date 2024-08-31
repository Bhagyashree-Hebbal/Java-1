package com.xworkz.revati.runner;

import com.xworkz.revati.internal.CentrlGovernmnet;

public class GovernmentRunner {

	public static void main(String[] args) {
		CentrlGovernmnet centrlGovernmnet = new CentrlGovernmnet("Karntaka", 1, "Janata Dal",
				"Gangadharaiah Parameshwara");
		centrlGovernmnet.display();
	}

}
