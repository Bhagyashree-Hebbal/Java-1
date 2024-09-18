package com.xworkz.rules.impl;

import com.xworkz.rules.media.MallRule;

public class MallRuleImpl implements MallRule {

	@Override
	public boolean validId() {
		System.out.println("running validId");
		return true;
	}

}
