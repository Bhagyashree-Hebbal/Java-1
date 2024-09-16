package com.xworkz.rules.media;

public interface HospitalRule {
	// literal variable
	String STATE = "KARNATAKA";

	// method
	boolean maintainSlience();

	int visitorAllowed();

	boolean provideEmergencyServices();

}
