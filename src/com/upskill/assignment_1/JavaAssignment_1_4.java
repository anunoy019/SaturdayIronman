package com.upskill.assignment_1;

public class JavaAssignment_1_4 {
	
//	Q4.A function returns 30, another function returns 50. 
//		Write a java program which will display subtraction value from bigger number to smaller.

	public static int firstFunction() {
		return 30;

	}

	public static int secondFunction() {
		return 50;

	}

	public static void main(String[] args) {

		// Call the two functions

		int firstResult = firstFunction();
		int secondResult = secondFunction();

		int biggerNumber = Math.max(firstResult, secondResult);
		int smallerNumber = Math.min(firstResult, secondResult);

		int subtraction = biggerNumber - smallerNumber;

		System.out.println("The subtraction of the bigger number from the smaller number is " + subtraction);

	}

}
