package com.xworkz.rules.runner;

import com.xworkz.rules.impl.MallRuleImpl;
import com.xworkz.rules.media.MallRule;
import com.xworkz.rules.use.ShopRules;

public class MallRunner {

	public static void main(String[] args) {
		MallRule MallRule = new MallRuleImpl();
		ShopRules shopRules = new ShopRules();
		shopRules.setMallRule(MallRule);
		shopRules.shopping();

	}

}
