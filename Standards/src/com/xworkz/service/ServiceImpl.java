package com.xworkz.service;

import com.xworkz.standards.repository.Repository;

public class ServiceImpl implements Service {

	private Repository repository;

	public ServiceImpl(Repository repository) {
		this.repository = repository;
		System.out.println("Repository param const in serviceImpl");
	}

	@Override
	public String push() {
		System.out.println("Running in push ServiceImpl");
		if (repository != null) {
			boolean saved = repository.save();
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
		System.out.println("Refresh in serviceImpl");
		if (repository != null) {
			int value = repository.update();
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

}
