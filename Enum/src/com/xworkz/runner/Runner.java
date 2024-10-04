package com.xworkz.runner;

import com.xworkz.constants.ProductType;
import com.xworkz.constants.SeatType;
import com.xworkz.constants.TicketType;
import com.xworkz.dto.CustomerDTO;
import com.xworkz.dto.TicketBookDTO;

public class Runner {

	public static void main(String[] args) {

		TicketBookDTO ticketBookDTO = new TicketBookDTO("Devara", "PVR", TicketType.OFFLINE, SeatType.PREMIUM);
		System.out.println(ticketBookDTO.getMovieName());
		System.out.println(ticketBookDTO.getTheaterName());
		System.out.println(ticketBookDTO.getTicketType().getCost());
		System.out.println(ticketBookDTO.getSeatType().getSeatNo());

		System.out.println("========================================================");

		CustomerDTO customerDTO = new CustomerDTO("Sharanya", "sharanya123@gmail.com", ProductType.FURRNITURE);
		System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getEmail());
		System.out.println(customerDTO.getProductType());

	}

}



