package com.upskill.assignment_1;

public class JavaAssignment_1_5 {
	
//	Q5. Write a java program which will display name and guest estimate age of every students in your class.
//	(write separate method for every student).

	public static void displayJohnInfo() {
		String name = "John";
		int age = 30;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("");

	}

	public static void displayMaxInfo() {
		String name = "Max";
		int age = 35;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("");

	}

	public static void displayMickyInfo() {
		String name = "Micky";
		int age = 33;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("");

	}

	public static void main(String[] args) {
		displayJohnInfo();
		displayMaxInfo();
		displayMickyInfo();

	}

}
