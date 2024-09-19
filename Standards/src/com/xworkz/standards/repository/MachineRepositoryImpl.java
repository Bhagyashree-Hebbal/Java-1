package com.xworkz.standards.repository;

public class MachineRepositoryImpl implements MachineRepository {

	@Override
	public void save() {
		System.out.println("Running save in MachineRepositoryImpl");

	}

	@Override
	public int update() {
		System.out.println("Running update in MachineRepositoryImpl");
		return 10;
	}

	@Override
	public int delete() {
		System.out.println("Running delete in MachineRepositoryImpl");
		return 15;
	}

	@Override
	public int read() {
		System.out.println("Running read in MachineRepositoryImpl");
		return 20;
	}

}
