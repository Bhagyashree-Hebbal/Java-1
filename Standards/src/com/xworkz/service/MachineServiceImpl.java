package com.xworkz.service;

import com.xworkz.standards.repository.MachineRepository;

public class MachineServiceImpl implements MachineService {

	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
		System.out.println("MachineRepository param const in MachineServiceImpl");
	}

	@Override
	public String save() {
		System.out.println("Running in save AddressServiceImpl");
		if (machineRepository != null) {
			machineRepository.save();// void datatype
			System.out.println("Saved in repo");
			return "Success";
		} else {
			System.out.println("Not saved in repo...");
			return "Failure";
		}
	}

	@Override
	public String update() {
		System.out.println("Update in AddressServiceImpl");
		if (machineRepository != null) {
			int value = machineRepository.update();
			if (value < 1) {// int datatype
				System.out.println("Update Success value:" + value);
				return "Success";
			} else {
				System.out.println("Update Failure value:" + value);
				return "Failure";
			}
		}
		return "Issue";
	}

	@Override
	public String delete() {
		System.out.println("Delete in AddressServiceImpl");
		if (machineRepository != null) {
			int value = machineRepository.update();
			if (value > 1) { // int datatype
				System.out.println("Delete Success value:" + value);
				return "Success";
			} else {
				System.out.println("Delete Failure value:" + value);
				return "Failure";
			}
		}
		return "Issue";
	}

	@Override
	public String read() {
		System.out.println("Read in AddressServiceImpl");
		if (machineRepository != null) {
			int number = machineRepository.update();
			if (number >= 1) { // int datatype
				System.out.println("Read Success value:" + number);
				return "Success";
			} else {
				System.out.println("Read Failure value:" + number);
				return "Failure";
			}
		}
		return "Issue";
	}

}
