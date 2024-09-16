package com.xworkz.rules.runner;

import com.xworkz.rules.internal.TempleProtection;

public class TempleRuleRunner {

	public static void main(String[] args) {
		TempleProtection templeRule = new TempleProtection();

		templeRule.removeFootwear();
		templeRule.maintainSilence();
		templeRule.followQueue();
		templeRule.traditionalDress();
		templeRule.avoidPhotography();
		templeRule.respectRituals();
		templeRule.avoidLittering();
		templeRule.donateGenerously();
		templeRule.avoidTouchingIdols();
		templeRule.followTempleTimings();

		templeRule.godNames();
		templeRule.prayToGod();

	}

}
