package com.xworkz.practise.internal.dto;

import com.xworkz.practise.internal.constants.Country;
import com.xworkz.practise.internal.constants.Qualification;

public class RegisterDTO {

	private String name;
	private String collegeName;
	private Qualification qualification;
	private Country country;

	public RegisterDTO() {
		System.out.println("Running no-arg constuctor");
	}

	public RegisterDTO(String name, String collegeName, Qualification qualification) {
		super();
		this.name = name;
		this.collegeName = collegeName;
		this.qualification = qualification;
	}

	public String getName() {
		return name;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
