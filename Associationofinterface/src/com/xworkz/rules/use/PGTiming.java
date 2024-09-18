package com.xworkz.rules.use;

import com.xworkz.rules.media.PGRule;

public class PGTiming {

	private PGRule pgRule;

	public void setPGRule(PGRule pgRule) {
		this.pgRule = pgRule;
	}

	public void restriction() {
		System.out.println("running restriction in PGTiming");
		if (pgRule != null) {
			System.out.println("pgRule is not null");
			pgRule.costPerMonth();
			pgRule.wifi();
		} else {
			System.out.println("pgRule is null");
		}
	}
}
