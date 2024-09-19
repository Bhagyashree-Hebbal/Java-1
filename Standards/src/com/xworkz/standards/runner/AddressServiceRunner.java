package com.xworkz.standards.runner;

import com.xworkz.service.AddressService;
import com.xworkz.service.AddressServiceImpl;
import com.xworkz.standards.repository.AddressRepository;
import com.xworkz.standards.repository.AddressRepositoryImpl;

public class AddressServiceRunner {

	public static void main(String[] args) {

		AddressRepository addressRepository = new AddressRepositoryImpl();
		AddressService addressService = new AddressServiceImpl(addressRepository);

		String msg1 = addressService.push();
		System.out.println("Push return:" + msg1);

		System.out.println("======================");

		String msg2 = addressService.refresh();
		System.out.println("Refresh return:" + msg2);

		System.out.println("======================");

		String msg3 = addressService.remove();
		System.out.println("Remove return:" + msg3);

		System.out.println("======================");

		String msg4 = addressService.load();
		System.out.println("Load return:" + msg4);
	}
}
