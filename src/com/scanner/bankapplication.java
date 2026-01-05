package com.scanner;

public class bankapplication {
	private String customerName;
	private String customerAddress;
	private long phoneNumber;
	private double balance;

	public bankapplication(String customerName, String customerAddress, long phoneNumber, double balance) {
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("name : " + customerName);
		System.out.println("address : " + customerAddress);
		System.out.println("number : " + phoneNumber);
		System.out.println("balance : " + balance);

		System.out.println("Account created successfully");

	}

//	public static void main(String[] args) {
//		
//
//	}

}
