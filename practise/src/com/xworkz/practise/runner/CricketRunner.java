package com.xworkz.practise.runner;

import com.xworkz.practise.external.BCCI;
import com.xworkz.practise.impl.KACCricketRuleImpl;
import com.xworkz.practise.internal.CricketRule;

public class CricketRunner {

	public static void main(String[] args) {
		CricketRule cricketRule = new KACCricketRuleImpl();
		BCCI bcci = new BCCI();
		bcci.setCricketRule(cricketRule);
		bcci.check();

	}

}
