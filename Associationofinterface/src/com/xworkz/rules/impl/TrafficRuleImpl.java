package com.xworkz.rules.impl;

import com.xworkz.rules.media.TrafficRule;

public class TrafficRuleImpl implements TrafficRule {

	@Override
	public String licenceNo() {
		System.out.println("running licenceNo");
		return "XYZ987654";
	}

}
