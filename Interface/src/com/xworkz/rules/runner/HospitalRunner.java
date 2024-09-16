package com.xworkz.rules.runner;

import com.xworkz.rules.internal.FortisHospital;

public class HospitalRunner {

	public static void main(String[] args) {
		FortisHospital govtHospitalRule = new FortisHospital();
		govtHospitalRule.maintainSlience();
		govtHospitalRule.serve();
		govtHospitalRule.visitorAllowed();
		govtHospitalRule.provideEmergencyServices();

	}

}
