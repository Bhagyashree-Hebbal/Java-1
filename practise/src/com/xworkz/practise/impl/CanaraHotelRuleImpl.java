package com.xworkz.practise.impl;

import com.xworkz.practise.internal.HotelRule;

public class CanaraHotelRuleImpl implements HotelRule {

	@Override
	public boolean cleanPremises() {
		System.out.println("running cleanPremises");
		return false;
	}

}
