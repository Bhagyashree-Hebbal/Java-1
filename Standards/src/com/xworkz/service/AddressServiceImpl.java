package com.xworkz.service;

import com.xworkz.standards.repository.AddressRepository;

public class AddressServiceImpl implements AddressService {
	private AddressRepository addressRepository;

	public AddressServiceImpl(AddressRepository addressRepository) {
		this.addressRepository = addressRepository;
		System.out.println("AddressRepository param const in AddressServiceImpl");
	}

	@Override
	public String push() {
		System.out.println("Running in push AddressServiceImpl");
		if (addressRepository != null) {
			boolean saved = addressRepository.save();
			if (saved) {
				System.out.println("Saved in repo");
				return "Success";
			} else {
				System.out.println("Not saved in repo...");
				return "Failure";
			}
		}
		return "Issue";
	}

	@Override
	public String refresh() {
		System.out.println("Refresh in AddressServiceImpl");
		if (addressRepository != null) {
			int value = addressRepository.update();
			if (value < 1) {
				System.out.println("Update failure value:" + value);
				return "Failure";
			} else {
				System.out.println("Update Success value:" + value);
				return "Success";
			}
		}
		return "Issue";
	}

	@Override
	public String remove() {
		System.out.println("Remove in AddressServiceImpl");
		if (addressRepository != null) {
			addressRepository.delete();
			System.out.println("Deleted Success remove");
			return "Success";
		} else {
			System.out.println("Deleted Failure remove");
			return "Failure";
		}
	}

	@Override
	public String load() {
		System.out.println("Load in AddressServiceImpl");
		if (addressRepository != null) {
			String reading = addressRepository.read();
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
