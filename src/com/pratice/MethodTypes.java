package com.pratice;

public class MethodTypes {

	public static int hourlyIncome = 65;

	public static void main(String[] args) {

		MethodTypes obj = new MethodTypes();

		obj.annualIncomeVoid();

	}

	// void Method
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual income = " + calculateAnnualIncome);
	}
	
	

}
