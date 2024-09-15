package com.xworkz.details;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
	public static void main(String[] args) {
		String filePath = "C:\\Users\\hebba\\eclipse-workspace\\Task-12-09-24\\src\\com\\xworkz\\details\\textfile.txt"; // Replace
																															// with
																															// the
																															// path
																															// to
																															// your
																															// file

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
