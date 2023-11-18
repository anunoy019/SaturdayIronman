package com.pratice;

import java.util.ArrayList;

public class JavaPractice_1 {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();

		cars.add("Volvo");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");

		for (int i = 0; i < cars.size(); i++) {
			String car = cars.get(i);
			System.out.println(car);
		}

	}

}
