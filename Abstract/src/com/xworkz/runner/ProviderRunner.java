package com.xworkz.runner;

import com.xworkz.internal.AirtelInternetProvider;
import com.xworkz.internal.BookMyShowMovieBookingProvider;
import com.xworkz.internal.BookingProvider;
import com.xworkz.internal.DellProvider;
import com.xworkz.internal.ExtremeAirtelInternetProvider;
import com.xworkz.internal.Fast5gExtreme;
import com.xworkz.internal.InternetProvider;
import com.xworkz.internal.JioInternetProvider;
import com.xworkz.internal.LenovoProvider;
import com.xworkz.internal.MovieBookingProvider;
import com.xworkz.internal.Provider;
import com.xworkz.internal.SatJioInternetrovider;

public class ProviderRunner {

	public static void main(String[] args) {
		Provider provider1 = new BookingProvider("Anaveer", "Soumya");
		provider1.service();
		System.out.println("============================");

		Provider provider2 = new DellProvider("Sharan", "Prashant");
		provider2.service();
		System.out.println("============================");

		Provider provider3 = new LenovoProvider("Shivu", "Appu", 50000);
		provider3.service();
		provider3.show();
		System.out.println("============================");

		Provider provider4 = new InternetProvider("Chiranjeevi", "Anup");
		provider4.service();
		System.out.println("============================");

		BookingProvider provider5 = new MovieBookingProvider("Chanveer", "Harsha");
		provider5.service();

		System.out.println("============================");

		MovieBookingProvider provider6 = new BookMyShowMovieBookingProvider("Harshika", "Prashanti", 500);
		provider6.service();
		System.out.println("============================");

		InternetProvider provider7 = new AirtelInternetProvider("Shilpa", "Praveen");
		provider7.service();
		System.out.println("============================");

		AirtelInternetProvider provider8 = new ExtremeAirtelInternetProvider("Gagan", "Tanvi");
		provider8.service();
		System.out.println("============================");

		ExtremeAirtelInternetProvider provider9 = new Fast5gExtreme("Sushant", "Akash");
		provider9.service();
		System.out.println("============================");

		InternetProvider provider10 = new JioInternetProvider("Santosh", "Ranjini");
		provider10.service();
		System.out.println("============================");

		JioInternetProvider provider11 = new SatJioInternetrovider("Prutvi", "Aishu", 1000, "2024-09-13");
		provider11.service();

		System.out.println("============================");

		Provider providers = new BookingProvider("Anu", "Anand");

		boolean check = providers.equals(providers);
		System.out.println("provider2 is same as provider1:" + check);

		boolean check1 = provider1.equals(provider2);
		System.out.println("provider1 is same as provider2:" + check1);

		boolean check2 = provider2.equals(provider3);
		System.out.println("provider2 is same as provider3:" + check2);

		boolean check3 = provider3.equals(provider4);
		System.out.println("provider3 is same as provider4:" + check3);

		boolean check4 = provider4.equals(provider5);
		System.out.println("provider4 is same as provider5:" + check4);

		boolean check5 = provider6.equals(provider7);
		System.out.println("provider6 is same as provider7:" + check5);

		boolean check6 = provider8.equals(provider6);
		System.out.println("provider6 is same as provider8:" + check6);

		System.out.println(provider1.toString());
		System.out.println(provider2.toString());
		System.out.println(provider3.toString());
		System.out.println(provider4.toString());
		System.out.println(provider5.toString());
		System.out.println(provider6.toString());
		System.out.println(provider7.toString());
		System.out.println(provider8.toString());
		System.out.println(provider9.toString());
	}
}
