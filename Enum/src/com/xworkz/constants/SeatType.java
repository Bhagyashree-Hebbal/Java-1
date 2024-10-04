package com.xworkz.constants;

public enum SeatType {

	RECLINER(20), PREMIUM(30), EXECUTIVE(50);

	private final int seatNo;

	private SeatType(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}
}
