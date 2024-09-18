package com.xworkz.rules.runner;

import com.xworkz.rules.impl.PGRuleImpl;
import com.xworkz.rules.media.PGRule;
import com.xworkz.rules.use.PGTiming;

public class PGRunner {

	public static void main(String[] args) {
		PGRule pgRule = new PGRuleImpl();
		PGTiming pgTiming = new PGTiming();
		pgTiming.setPGRule(pgRule);
		pgTiming.restriction();
	}

}
