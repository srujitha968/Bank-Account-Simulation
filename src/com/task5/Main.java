package com.task5;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		CustomerDetails dc = new CustomerDetails();
		
		dc.add();
		System.out.println("===============================================");
		System.out.println("Use any one of the user to check the working...");
		
		System.out.println("Enter the username:- ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Account Number:- ");
		String acc = sc.nextLine();
		
		boolean flag = dc.checkUser(name, acc);
		boolean choice = true;
		
		if(flag == true) {
			
			while(choice) {
				System.out.println("=================================");
				System.out.println("  1. Deposit");
				System.out.println("  2. Withdraw");
				System.out.println("  3. Show Transaction History");
				System.out.println("  4. Exit");
				
				int ch = sc.nextInt();
				switch(ch) {
					case 1: System.out.println("Enter the amount for depositing:");
							double amu = sc.nextDouble();
							dc.deposit(name, amu);
							break;
							
					case 2: System.out.println("Enter the amount for withdrawl:");
							double am= sc.nextDouble();
							dc.withDraw(name, am);
							break;
							
					case 3: System.out.println("Your Transaction history");
							dc.transaction();
					 		break;
					 		
					case 4: System.out.println("Thank you, Visit again...!");
							choice = false;
					 		break;
					 		
					default : System.out.println("Please choose in the given options only...");
								break;
				}
			}
		}else {
			dc.add();
			System.out.println("These are the sample users i created for testing the project...");
			System.out.println("Use any one of them...");
		}
		sc.close();
	}
}
