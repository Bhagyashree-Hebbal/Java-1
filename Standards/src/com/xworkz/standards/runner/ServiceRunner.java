package com.xworkz.standards.runner;

import com.xworkz.service.Service;
import com.xworkz.service.ServiceImpl;
import com.xworkz.standards.repository.Repository;
import com.xworkz.standards.repository.RepositoryImpl;

public class ServiceRunner {

	public static void main(String[] args) {
		// repo first
		Repository repository = new RepositoryImpl();
		// service+assoc
		Service service = new ServiceImpl(repository);
		// invoke push
		String msg1 = service.push();
		System.out.println("Push return:" + msg1);

		System.out.println("======================");

		String msg2 = service.refresh();
		System.out.println("Refresh return:" + msg2);
	}

}
