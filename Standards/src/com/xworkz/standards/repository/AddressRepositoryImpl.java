package com.xworkz.standards.repository;

public class AddressRepositoryImpl implements AddressRepository {

	@Override
	public boolean save() {
		System.out.println("Running save in AddressRepositoryImpl");
		return true;
	}

	@Override
	public int update() {
		System.out.println("Running update in AddressRepositoryImpl");
		return 5;
	}

	@Override
	public void delete() {
		System.out.println("Running delete in AddressRepositoryImpl");

	}

	@Override
	public String read() {
		System.out.println("Running read in AddressRepositoryImpl");
		return "Read File";
	}

}
