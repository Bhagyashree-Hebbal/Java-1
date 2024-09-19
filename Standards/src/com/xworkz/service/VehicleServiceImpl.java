package com.xworkz.service;

import com.xworkz.standards.repository.VehicleRepository;

public class VehicleServiceImpl implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
		System.out.println("VehicleRepository param const in VehicleServiceImpl");
	}

	@Override
	public String persist() {
		System.out.println("Running in push VehicleServiceImpl");
		if (vehicleRepository != null) {
			vehicleRepository.save();
			System.out.println("Saved in repo");
			return "Success";
		} else {
			System.out.println("Not saved in repo...");
			return "Failure";
		}
	}

	@Override
	public String merge() {
		System.out.println("Running in push VehicleServiceImpl");
		if (vehicleRepository != null) {
			vehicleRepository.update();
			System.out.println("Updated in repo");
			return "Success";
		} else {
			System.out.println("Not updated in repo...");
			return "Failure";
		}
	}

	@Override
	public String clear() {
		System.out.println("Running in push AddressServiceImpl");
		if (vehicleRepository != null) {
			boolean deleted = vehicleRepository.delete();
			if (deleted) {
				System.out.println("Deleted in repo");
				return "Success";
			} else {
				System.out.println("Not deleted in repo...");
				return "Failure";
			}
		}
		return "Issue";
	}

	@Override
	public String search() {
		System.out.println("Load in AddressServiceImpl");
		if (vehicleRepository != null) {
			String reading = vehicleRepository.read();
			if (reading != null) {
				System.out.println("Load Success read:" + reading);
				return "Success";
			} else {
				System.out.println("Load Failure read:" + reading);
				return "Failure";
			}
		}
		return "Issue";
	}

}
