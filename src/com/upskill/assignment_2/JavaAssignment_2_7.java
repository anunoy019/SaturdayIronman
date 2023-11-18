package com.upskill.assignment_2;

public class JavaAssignment_2_7 {
	
	//You are given two integer number (a=25, b=30), write a program to swap them and 
    //display result on the screen. 

	public static void main(String[] args) {
		
		int a = 25;
		int b = 30;
		
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		int c = a;
		
		a = b;
		b =c;
		
		System.out.println("After swapping: a = " + a + ", b = " + b);

	}

}
