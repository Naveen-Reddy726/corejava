package com.scanner;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {
		
		 Scanner Scanner=new Scanner(System.in);
		 
		 System.out.println("enter your name : ");
		 String name=Scanner.next();
		 
		 System.out.println("enter your Address : ");
		 String Address=Scanner.next();
		 
		 System.out.println("enter your nymber : ");
		 long phoneNumber=Scanner.nextLong();
		 
		 System.out.println("enter your balance : ");
		 int Amount = Scanner.nextInt();
		 
		 
		 bankapplication obj = new bankapplication(name, Address, phoneNumber, Amount);
		 
		 
		 
		 

	}

}
