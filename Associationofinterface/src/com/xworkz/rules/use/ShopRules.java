package com.xworkz.rules.use;

import com.xworkz.rules.media.MallRule;

public class ShopRules {

	private MallRule mallRule;

	public void setMallRule(MallRule mallRule) {
		this.mallRule = mallRule;
	}

	public void shopping() {
		System.out.println("running shopping in MallRule");
		if (mallRule != null) {
			System.out.println("MallRule is not null");
			mallRule.validId();
		} else {
			System.out.println("MallRule is null");
		}
	}
}
