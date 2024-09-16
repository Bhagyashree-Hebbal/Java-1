package com.xworkz.rules.internal;

import com.xworkz.rules.media.GovtHospital;

public class FortisHospital implements GovtHospital {
	public FortisHospital() {
		super();
		System.out.println("no-arg const FortisHospital");
	}

	@Override
	public boolean maintainSlience() {
		System.out.println("running maintainSlience");
		return true;
	}

	@Override
	public int visitorAllowed() {
		System.out.println("running visitorAllowed");
		return 500;
	}

	@Override
	public boolean provideEmergencyServices() {
		System.out.println("running provideEmergencyServices");
		return true;
	}

	@Override
	public boolean serve() {
		System.out.println("running serve");
		return true;
	}
}
