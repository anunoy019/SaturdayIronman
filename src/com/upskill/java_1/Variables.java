package com.upskill.java_1;

public class Variables {

	// Variables in Java

	public String country = "USA"; // Instance OR global variable - Variables
									// declared in Class level, outside method
	public String region = "North America"; // Static variable - variable belong
											// to class and don't required
											// creating object

	public static void main(String[] args) {

		String city = "New York"; // Local variable - variable declared in
									// methods
		String police = "NYPD";
		System.out.println(city);
		System.out.println(police);
		nj("Essex");
		pa("Bensalem");
		Variables variables = new Variables();
		System.out.println(variables.country);
		System.out.println(variables.region);

	}

	public static void nj(String county) { // Method parameter - variable used
											// as method parameter
											// Local variable - variables
											// declare in method
		String city = "Bloomfield";
		String police = "BPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);

	}

	public static void pa(String county) {

		String city = "Phili";
		String police = "PPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
	}

}
