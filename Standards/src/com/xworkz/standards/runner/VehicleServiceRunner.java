package com.xworkz.standards.runner;

import com.xworkz.service.VehicleService;
import com.xworkz.service.VehicleServiceImpl;
import com.xworkz.standards.repository.VehicleRepository;
import com.xworkz.standards.repository.VehicleRepositoryImpl;

public class VehicleServiceRunner {

	public static void main(String[] args) {
		VehicleRepository vehicleRepository = new VehicleRepositoryImpl();
		VehicleService vehicleService = new VehicleServiceImpl(vehicleRepository);

		String msg1 = vehicleService.persist();
		System.out.println("Push return:" + msg1);

		System.out.println("======================");

		String msg2 = vehicleService.merge();
		System.out.println("Refresh return:" + msg2);

		System.out.println("======================");

		String msg3 = vehicleService.clear();
		System.out.println("Remove return:" + msg3);

		System.out.println("======================");

		String msg4 = vehicleService.search();
		System.out.println("Load return:" + msg4);

	}

}
