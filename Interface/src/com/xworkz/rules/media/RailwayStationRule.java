package com.xworkz.rules.media;

public interface RailwayStationRule {
	boolean carryValidTicket();

	boolean followPlatformRules();

	boolean avoidLittering();

	boolean maintainQueue();

	boolean followAnnouncements();

	boolean avoidCrossingTracks();

	boolean useFootOverBridge();

	boolean respectStaff();

	boolean avoidSmoking();

	boolean followSecurityChecks();

	boolean avoidBlockingDoors();

	boolean useDesignatedExits();

	boolean avoidUnattendedBaggage();

	boolean followEmergencyProcedures();

	boolean respectOtherPassengers();
}
