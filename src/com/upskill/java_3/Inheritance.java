package com.upskill.java_3;

import com.pratice.MethodTypes;

public class Inheritance extends com.upskill.java_1.MethodType {
	
	/* The process of obtaining the data members and methods from one class to another class is known as inheritance
	 * -  single inheritance
	 * -  Multiple Inheritance( Java does not support Multiple Inheritance directly rather through interfaces) 
	 * -  Multilevel Inheritance
	 */

	public static void main(String[] args) {

		Inheritance obj = new Inheritance();

		obj.annualIncomeVoid();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn()); 
		obj.weeklyIncomeStatic();

	}

}
