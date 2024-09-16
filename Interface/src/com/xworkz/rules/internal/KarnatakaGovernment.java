package com.xworkz.rules.internal;

import com.xworkz.rules.media.TrafficPolice;

public class KarnatakaGovernment implements TrafficPolice {
	public KarnatakaGovernment() {
		super();
		System.out.println("no-arg const KarnatakaGovernment");
	}

	@Override
	public boolean wearHelmet() {
		System.out.println("running wearHelmet");
		return true;
	}

	@Override
	public boolean followSpeedLimit() {
		System.out.println("running followSpeedLimit");
		return true;
	}

	@Override
	public boolean stopAtRedLight() {
		System.out.println("running stopAtRedLight");
		return true;
	}

	@Override
	public boolean useIndicators() {
		System.out.println("running useIndicators");
		return true;
	}

	@Override
	public boolean followLaneDiscipline() {
		System.out.println("running followLaneDiscipline");
		return true;
	}

	@Override
	public boolean avoidDrunkDriving() {
		System.out.println("running avoidDrunkDriving");
		return true;
	}

	@Override
	public boolean useSeatBelt() {
		System.out.println("running useSeatBelt");
		return true;
	}

	@Override
	public boolean avoidMobileUsage() {
		System.out.println("running avoidMobileUsage");
		return true;
	}

	@Override
	public boolean followTrafficSignals() {
		System.out.println("running followTrafficSignals");
		return true;
	}

	@Override
	public boolean giveWayToEmergencyVehicles() {
		System.out.println("running giveWayToEmergencyVehicles");
		return true;
	}

	@Override
	public boolean avoidOverloading() {
		System.out.println("running avoidOverloading");
		return true;
	}

	@Override
	public boolean maintainSafeDistance() {
		System.out.println("running maintainSafeDistance");
		return true;
	}

	@Override
	public boolean followNoParkingZones() {
		System.out.println("running followNoParkingZones");
		return true;
	}

	@Override
	public boolean avoidHonkingInSilentZones() {
		System.out.println("running avoidHonkingInSilentZones");
		return true;
	}

	@Override
	public boolean carryValidLicense() {
		System.out.println("running carryValidLicense");
		return true;
	}

	@Override
	public String signalcolor() {
		System.out.println("running signalcolor");
		return "red,green,yellow";
	}

	@Override
	public int obeySpeedLimit() {
		System.out.println("running obeySpeedLimit");
		return 60;
	}

	@Override
	public boolean slowdowninZebracrossings() {
		System.out.println("running slowdowninZebracrossings");
		return true;
	}

	@Override
	public boolean overspeeding() {
		System.out.println("running overspeeding");
		return false;
	}

	@Override
	public boolean followtrafficSignals() {
		System.out.println("running followtrafficSignals");
		return true;
	}
}
