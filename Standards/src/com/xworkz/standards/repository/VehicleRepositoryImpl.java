package com.xworkz.standards.repository;

public class VehicleRepositoryImpl implements VehicleRepository {

	@Override
	public void save() {
		System.out.println("Running save in VehicleRepositoryImpl");

	}

	@Override
	public void update() {
		System.out.println("Running update in VehicleRepositoryImpl");

	}

	@Override
	public boolean delete() {
		System.out.println("Running delete in VehicleRepositoryImpl");
		return true;
	}

	@Override
	public String read() {
		System.out.println("Running read in VehicleRepositoryImpl");
		return "reading";
	}
}
