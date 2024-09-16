package com.xworkz.rules.runner;

import com.xworkz.rules.internal.RailwayDepartment;

public class RailwayStationRuleRunner {

	public static void main(String[] args) {
		RailwayDepartment railwayStationRule = new RailwayDepartment();

		railwayStationRule.carryValidTicket();
		railwayStationRule.followPlatformRules();
		railwayStationRule.avoidLittering();
		railwayStationRule.maintainQueue();
		railwayStationRule.followAnnouncements();
		railwayStationRule.avoidCrossingTracks();
		railwayStationRule.useFootOverBridge();
		railwayStationRule.respectStaff();
		railwayStationRule.avoidSmoking();
		railwayStationRule.followSecurityChecks();
		railwayStationRule.avoidBlockingDoors();
		railwayStationRule.useDesignatedExits();
		railwayStationRule.avoidUnattendedBaggage();
		railwayStationRule.followEmergencyProcedures();
		railwayStationRule.respectOtherPassengers();

		railwayStationRule.keepVolumeLow();
		railwayStationRule.avoidRunning();
		railwayStationRule.useTicketGates();
		railwayStationRule.reportSuspiciousActivity();

	}

}
