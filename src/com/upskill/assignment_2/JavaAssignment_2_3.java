package com.upskill.assignment_2;

public class JavaAssignment_2_3 {

	// Write two java functions which will return two different integer values,
	// write a
	// program to compare those numbers and send message that one number is
	// bigger
	// than other. (hints: using if..else)

	public static void main(String[] args) {
		
		int number1 = getNumber1();
		int number2 = getNumber2();
		
		
		if ( number1 > number2) {
			System.out.println(number1 + " is bigger than " + number2);
		} else if (number1 < number2) {
			System.out.println(number1 + " is less than " + number2);
		} else {
			System.out.println(number1 + " and " + number2 + " are equal. ");
		}

	}

	public static int getNumber1() {
		return 90;

	}
	
	public static int getNumber2() {
		return 80;
	}

}
