package com.xworkz.standards.repository;

public class RepositoryImpl implements Repository {

	@Override
	public boolean save() {
		System.out.println("Running save in RepositoryImpl");
		return true;
	}

	@Override
	public int update() {
		System.out.println("Running update in RepositoryImpl");
		return 10;
	}

}
