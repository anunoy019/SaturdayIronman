package com.upskill.assignment_3;

public class JavaAssignment_3_1 {
	
	private String accountName;
	private double balance;
	
	public JavaAssignment_3_1(String accountName, double balance) {
		super();
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw (double amount) {
		
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient funds for withdrawal");
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("a. account name : " + accountName);
		System.out.println("b. initial amnout : " + balance);
	}
	
	public static void main(String[] args) {
		
		JavaAssignment_3_1 savingsAccount = new JavaAssignment_3_1("Saving", 1000.00);
		JavaAssignment_3_1 checkingAccount = new JavaAssignment_3_1("Checking", 2000.00);
		
		System.out.println("Intitial Account information : ");
		savingsAccount.displayAccountInfo();
		checkingAccount.displayAccountInfo();
		
		savingsAccount.deposite(500.00);
		savingsAccount.deposite(600.00);
		
		System.out.println("New Account Information After Deposits : ");
		savingsAccount.displayAccountInfo();
		checkingAccount.displayAccountInfo();
	}
	
	
	

}
