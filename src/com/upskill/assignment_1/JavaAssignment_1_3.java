package com.upskill.assignment_1;

public class JavaAssignment_1_3 {

	// Q3. A function which returns the multiply value of a and b where a = 9
	// and b = 11.
	// Write a program which will display addition of a +b + function returns
	// value.

	public static void main(String[] args) {

		int a = 9;
		int b = 11;

		int result = multiply(a, b);
		int sum = a + b;

		int finalResult = sum + result;

		System.out.println("Final result " + finalResult);
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

}
