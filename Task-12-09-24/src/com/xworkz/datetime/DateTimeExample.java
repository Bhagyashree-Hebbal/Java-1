package com.xworkz.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeExample {

	public static void main(String[] args) {
		// Create current date and datetime
		LocalDate currentDate = LocalDate.now();
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Create past date (e.g., 5 days ago)
		LocalDate pastDate = currentDate.minusDays(5);
		System.out.println("Past Date: " + pastDate);

		// Create future date (e.g., 5 days from now)
		LocalDate futureDate = currentDate.plusDays(5);
		System.out.println("Future Date: " + futureDate);

		// Create past datetime (e.g., 5 hours ago)
		LocalDateTime pastDateTime = currentDateTime.minusHours(5);
		System.out.println("Past DateTime: " + pastDateTime);

		// Create future datetime (e.g., 5 hours from now)
		LocalDateTime futureDateTime = currentDateTime.plusHours(5);
		System.out.println("Future DateTime: " + futureDateTime);

	}

}
