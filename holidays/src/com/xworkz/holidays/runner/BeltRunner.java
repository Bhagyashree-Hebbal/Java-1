package com.xworkz.holidays.runner;

import com.xworkz.holidays.internal.Belt;
import com.xworkz.holidays.internal.Dancer;
import com.xworkz.holidays.internal.LeatherBelt;

public class BeltRunner {

	public static void main(String[] args) {
		Dancer dancer1 = new Dancer();
		Belt belt1 = new Belt();
		dancer1.use(belt1);

		LeatherBelt leatherBelt1 = new LeatherBelt();
		dancer1.use(leatherBelt1);

	}

}
