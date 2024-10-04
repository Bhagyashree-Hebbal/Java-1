package com.xworkz.practise.external;

import com.xworkz.practise.internal.HotelRule;

public class FoodSafetyDepartment {

	private HotelRule hotelRule;

	public void setHotelRule(HotelRule hotelRule) {
		this.hotelRule = hotelRule;
	}

	public void inspection() {
		System.out.println("running inspection in FoodSafetyDepartment");
		if (hotelRule != null) {
			System.out.println("hotelRule is not null");
			hotelRule.cleanPremises();
		} else {
			System.out.println("hotelRule is null");
		}

	}
}
