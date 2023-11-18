package com.upskill.java_1;

public class MethodType {

	public static int hourlyIncome = 65;

	public static void main(String[] args) {

		MethodType obj = new MethodType();

		obj.annualIncomeVoid(); // Void method

		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn()); // Return method

		weeklyIncomeStatic(); // Static method

	}

	// void method
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}

	// return type Method
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}

	// static Method
	public static void weeklyIncomeStatic() {
		int calculateWeelkyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeelkyIncome);
	}
}
