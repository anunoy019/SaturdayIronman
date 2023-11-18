package com.upskill.java_2;

public class Loop {

	// Type of the Loops
	// 1. For Loop
	// 2. While Loop
	// 3. Do While Loop
	// 4.Infinite Loop

	public static void main(String[] args) {
		// practiceForLoop();
		// practiceWhileLoop();
		// praticDoWhileLoop();
		// praticeInfiniteLoop();
		praticeNestedForLoop();
	}

	public static void practiceForLoop() {
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println("For Loops Number = " + i);
		}
	}

	public static void practiceWhileLoop() {

		int i = 1;
		while (i <= 10) {
			System.out.println("While Loops number = " + i);
			i++;
		}
	}

	public static void praticDoWhileLoop() {
		int i = 1;
		do {
			System.out.println("Do While Loops number = " + i);
			i++;
		} while (i <= 0);

	}

	public static void praticeInfiniteLoop() {
		int i;
		for (i = 1; i <= 15; i++) {
			System.out.println("Infinite Loops number = " + i);
		}
	}

	public static void praticeNestedForLoop() {

		int i;
		int j;

		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				int mutification = i * j;
				System.out.print(mutification + " | ");
			}
			System.out.println(" - > ");
		}

	}
}
