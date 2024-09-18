package com.xworkz.rules.impl;

import com.xworkz.rules.media.PGRule;

public class PGRuleImpl implements PGRule {

	@Override
	public double costPerMonth() {
		System.out.println("running costPerMonth");
		return 5000;
	}

	@Override
	public boolean wifi() {
		System.out.println("running wifi");
		return true;
	}

}
