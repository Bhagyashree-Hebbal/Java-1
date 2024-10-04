package com.xworkz.practise.runner;

import com.xworkz.practise.internal.constants.Country;
import com.xworkz.practise.internal.constants.Qualification;
import com.xworkz.practise.internal.dto.RegisterDTO;

public class RegisterRunner {

	public static void main(String[] args) {

		RegisterDTO registerDTO = new RegisterDTO("Deepak", "Atria", Qualification.BE);
		registerDTO.setCountry(Country.INDIA);

		String collName = registerDTO.getCollegeName();
		System.out.println(collName.toUpperCase());
		Country country = registerDTO.getCountry();
		int code = registerDTO.getCountry().getCode();
		System.out.println("Code:" + code);

		Qualification qualification = registerDTO.getQualification();
		System.out.println("Qualification Name:" + qualification);

	}

}
