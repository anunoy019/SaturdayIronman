package com.upskill.assignment_2;

public class JavaAssignment_2_9 {
	
	/* Write a program to swap two string variables (Talen, Tech) and display result on the 
     screen. */

	public static void main(String[] args) {
		
		String Talen = "Talen";
		String Tech = "Tech";
		
		System.out.println("Before swapping :");
		System.out.println("Talen = " + Talen);
		System.out.println("Tech = " + Tech);
		
		String c = Talen;
		
		Talen = Tech;
		Tech = c;
		
		System.out.println("Afte swapping : ");
		System.out.println("Talen = " + Talen);
		System.out.println("Tech = " + Tech);
	
		
	}

}
