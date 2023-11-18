package com.upskill.assignment_3;

//Bank is a class that provides functionality to get interest rate. Display different interest rate using rate functionality for Chase, 

//City and TD banks followed by 8%, 7% and 9%. Hints: using method override.

class Bank {
	public int getInterestRate() {
		return 0; // Default implementation (0% interest)
	}
}

class ChaseBank extends Bank {
	@Override
	public int getInterestRate() {
		return 8;
	}
}

class CityBank extends Bank {
	@Override
	public int getInterestRate() {
		return 7;
	}
}

class TDBank extends Bank {
	@Override
	public int getInterestRate() {
		return 9;
	}
}

public class JavaAssignment_3_3 {
	public static void main(String[] args) {
		ChaseBank chase = new ChaseBank();
		CityBank city = new CityBank();
		TDBank td = new TDBank();

		System.out.println("Chase Bank Interest Rate: " + chase.getInterestRate() + "%");
		System.out.println("City Bank Interest Rate: " + city.getInterestRate() + "%");
		System.out.println("TD Bank Interest Rate: " + td.getInterestRate() + "%");
	}

}
