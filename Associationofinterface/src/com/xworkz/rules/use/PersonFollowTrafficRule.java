package com.xworkz.rules.use;

import com.xworkz.rules.media.TrafficRule;

public class PersonFollowTrafficRule {

	private TrafficRule trafficRule;

	public void setTrafficRule(TrafficRule trafficRule) {
		this.trafficRule = trafficRule;
	}

	public void follow() {
		System.out.println("running check in PersonFollowTrafficRule");
		if (trafficRule != null) {
			System.out.println("trafficRule is not null");
			trafficRule.licenceNo();
		} else {
			System.out.println("trafficRule is not null");
		}
	}
}
