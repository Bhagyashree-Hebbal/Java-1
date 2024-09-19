package com.xworkz.standards.runner;

import com.xworkz.service.MachineService;
import com.xworkz.service.MachineServiceImpl;
import com.xworkz.standards.repository.MachineRepository;
import com.xworkz.standards.repository.MachineRepositoryImpl;

public class MachineServiceRunner {

	public static void main(String[] args) {
		MachineRepository machineRepository = new MachineRepositoryImpl();
		MachineService machineService = new MachineServiceImpl(machineRepository);
		
		String msg1 = machineService.save();
		System.out.println("Save return:" + msg1);

		System.out.println("======================");

		String msg2 = machineService.update();
		System.out.println("Update return:" + msg2);

		System.out.println("======================");

		String msg3 = machineService.delete();
		System.out.println("Delete return:" + msg3);

		System.out.println("======================");

		String msg4 = machineService.read();
		System.out.println("Read return:" + msg4);

	}
}
