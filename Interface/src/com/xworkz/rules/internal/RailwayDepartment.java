package com.xworkz.rules.internal;

import com.xworkz.rules.media.RailwayStationRegulations;

public class RailwayDepartment implements RailwayStationRegulations {
	public RailwayDepartment() {
		super();
		System.out.println("no-arg const RailwayDepartment");
	}

	@Override
	public boolean carryValidTicket() {
		System.out.println("running carryValidTicket");
		return false;
	}

	@Override
	public boolean followPlatformRules() {
		System.out.println("running followPlatformRules");
		return false;
	}

	@Override
	public boolean avoidLittering() {
		System.out.println("running avoidLittering");
		return false;
	}

	@Override
	public boolean maintainQueue() {
		System.out.println("running maintainQueue");
		return false;
	}

	@Override
	public boolean followAnnouncements() {
		System.out.println("running followAnnouncements");
		return false;
	}

	@Override
	public boolean avoidCrossingTracks() {
		System.out.println("running avoidCrossingTracks");
		return false;
	}

	@Override
	public boolean useFootOverBridge() {
		System.out.println("running useFootOverBridge");
		return false;
	}

	@Override
	public boolean respectStaff() {
		System.out.println("running respectStaff");
		return false;
	}

	@Override
	public boolean avoidSmoking() {
		System.out.println("running avoidSmoking");
		return false;
	}

	@Override
	public boolean followSecurityChecks() {
		System.out.println("running followSecurityChecks");
		return false;
	}

	@Override
	public boolean avoidBlockingDoors() {
		System.out.println("running avoidBlockingDoors");
		return false;
	}

	@Override
	public boolean useDesignatedExits() {
		System.out.println("running useDesignatedExits");
		return false;
	}

	@Override
	public boolean avoidUnattendedBaggage() {
		System.out.println("running avoidUnattendedBaggage");
		return false;
	}

	@Override
	public boolean followEmergencyProcedures() {
		System.out.println("running followEmergencyProcedures");
		return false;
	}

	@Override
	public boolean respectOtherPassengers() {
		System.out.println("running respectOtherPassengers");
		return false;
	}

	@Override
	public boolean keepVolumeLow() {
		System.out.println("running keepVolumeLow");
		return false;
	}

	@Override
	public boolean avoidRunning() {
		System.out.println("running avoidRunning");
		return false;
	}

	@Override
	public boolean useTicketGates() {
		System.out.println("running useTicketGates");
		return false;
	}

	@Override
	public boolean reportSuspiciousActivity() {
		System.out.println("running reportSuspiciousActivity");
		return false;
	}
}
