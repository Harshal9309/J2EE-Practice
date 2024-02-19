package com.jspiders.multithreading.resource;

public class Account {

	private double accountBlance;
	
	public synchronized void deposite(double amount) {
		System.out.println("Amount of Rupees" +amount+ "has been credited.");
		accountBlance += amount;
		System.out.println("Current balance is "+accountBlance);
	}
	
	public synchronized void withdraw(double amount) {
		System.out.println("Amount of Rupees" +amount+ "has been debited.");
		accountBlance -= amount;
		System.out.println("Current balance is "+accountBlance);
	}
}
