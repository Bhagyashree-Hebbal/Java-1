package com.xworkz.practise.internal.constants;

public enum Country {

	INDIA(91), USA(1);

	private int code;

	private Country(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
