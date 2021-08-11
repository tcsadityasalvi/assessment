package com.tcs.bankdetails;

import java.util.Date;
import java.util.Scanner;

public class Bank {
	private static SavingsAccount savings;
	private static CurrentAccount current;
	public static void main(String[] args) {
		
		Scanner savcurr = new Scanner(System.in);
		System.out.println("Account type for a user");
		String accountType=savcurr.nextLine();
		if(accountType.equalsIgnoreCase("savings")){
			
			 savings= new SavingsAccount(75000L, "Aditya", accountType, new Date(), true);
		}else if(accountType.equalsIgnoreCase("current")) {
			 current = new CurrentAccount(60000L, "Aditya", accountType, new Date(), true, 60000L);
		}
	}
}
