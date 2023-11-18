package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		// Array store multiple data using index

		int age = 30;
		int[] ageIronMan = new int[] { 25, 32, 37, 21, 27 };

		// Array index [0] [1] [2] [3] [4]

		System.out.println("Student Age : " + ageIronMan[2]);
		System.out.println("Total Student : " + ageIronMan.length);

		String[] nameIronMan = new String[] { "Arnob", "Yusuf", "Abdullah", "Madan" };

		System.out.println("Student Name : " + nameIronMan[2]);
		System.out.println("Total Student : " + nameIronMan.length);

		System.out.println("========================================================");

		for (String name : nameIronMan) {
			System.out.println(name);
		}

		System.out.println("=========================================================");

		// Multi-Dimentinal Array

		int[][] ageIronMan2D = { { 25, 32, 37, 21, 27 }, { 26, 30, 33, 28 } };

		System.out.println("Student Age 2D : " + ageIronMan2D[1][1]);

		System.out.println("========================================================");
		
		//// Hashmap store multiple data using key-value pair, Implementation of Map interface

		HashMap<String, Integer> Student = new HashMap<String, Integer>();

		Student.put("Yusuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Madan", 32);
		Student.put("Jannatul", 28);

		System.out.println("HashMap Student Age : " + Student.get("Yusuf"));

		HashMap<String, String> Capital = new HashMap<>();

		Capital.put("Bangladesh", "Dhaka");
		Capital.put("United Arab Emirates", "Abu Dhabi");
		Capital.put("Thailand", "Bangkok");
		Capital.put("Germany", "Berlin");

		System.out.println("Hashmap Country Capital : " + Capital.get("Bangladesh"));
		System.out.println("========================================================");
		
		// HashSet store unordered collection containing unique value,
		// Implementation of Set interface

		HashSet<String> car = new HashSet<>();

		car.add("BWM");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");

		System.out.println("HashSet Car : " + car);
		System.out.println("========================================================");
		
		// HashTable store multiple data using key-value pair, no duplicate,
		// also is synchronized (only one thread can be modified)

		Hashtable<String, String> Region = new Hashtable<>();

		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("HashTable Region : " + Region.get("BD"));
		System.out.println("========================================================");
	}

}
