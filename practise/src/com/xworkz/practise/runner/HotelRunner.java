package com.xworkz.practise.runner;

import com.xworkz.practise.external.FoodSafetyDepartment;
import com.xworkz.practise.impl.CanaraHotelRuleImpl;
import com.xworkz.practise.internal.HotelRule;

public class HotelRunner {

	public static void main(String[] args) {
		HotelRule hotelRule = new CanaraHotelRuleImpl();
		FoodSafetyDepartment foodSafetyDepartment = new FoodSafetyDepartment();
		foodSafetyDepartment.setHotelRule(hotelRule);
		foodSafetyDepartment.inspection();
	}

}
