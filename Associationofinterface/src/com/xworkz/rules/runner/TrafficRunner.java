package com.xworkz.rules.runner;

import com.xworkz.rules.impl.TrafficRuleImpl;
import com.xworkz.rules.media.TrafficRule;
import com.xworkz.rules.use.PersonFollowTrafficRule;

public class TrafficRunner {

	public static void main(String[] args) {
		TrafficRule trafficRule = new TrafficRuleImpl();
		PersonFollowTrafficRule personFollowTrafficRule = new PersonFollowTrafficRule();
		personFollowTrafficRule.setTrafficRule(trafficRule);
		personFollowTrafficRule.follow();

	}

}
