package com.task5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {
	
	List<Accounts> li = new ArrayList<>();
	List<Transaction> transactionHistory = new ArrayList<>();
	
	// This is the inner class for saving the transactions of the users
	public class Transaction{
		private String type;
		private double amount;
		private LocalDateTime time;
		
		Transaction(String type, double amount, LocalDateTime time){
			this.type = type;
			this.amount = amount;
			this.time =time;
		}
		
		@Override
		public String toString() {
			return "[ Transaction type = " + type + ", amount = " + amount + ", Time = " + time
					+ "]";
		}
	}
	
	public void add() {
		li.add(new Accounts("vasavi", "799579", 900));
		li.add(new Accounts("srujitha", "994932", 800));
		li.add(new Accounts("shivam", "863044", 900));
		li.add(new Accounts("anil", "879061", 500));
		for(Accounts a: li) {
			System.out.println(a.toString());
		}
	}
	
	// Method for validating the user
	public boolean checkUser(String user, String Acc) {	
		for (int i=0; i<li.size(); i++) {
			if(li.get(i).getAccountHolder().equals(user) && li.get(i).getAccountNumber().equals(Acc)) {
				System.out.println("Your current balance is "+ li.get(i).getBalance());
				return true;
			}
		}
		return false;
	}
	
	// Method for depositing the amount
	public void deposit(String user, double amount) {
		for (int i=0; i<li.size(); i++) {
			if(li.get(i).getAccountHolder().equals(user)) {
				double am = amount+ li.get(i).getBalance();
				li.get(i).setBalance(am);
				transactionHistory.add(new Transaction("deposit", amount, LocalDateTime.now()));
				System.out.println("Amount added sucessfully...!");
				System.out.println("Updated balance is: "+am);
			}
		}
	}
	
	// Method for withdraw the amount
	public void withDraw(String user, double amount) {
		for (int i=0; i<li.size(); i++) {
			if(li.get(i).getAccountHolder().equals(user)) {
				if(li.get(i).getBalance()>amount) {
					double am = li.get(i).getBalance() - amount;
					li.get(i).setBalance(am);
					transactionHistory.add(new Transaction("withdraw", amount, LocalDateTime.now()));
					System.out.println("Amount Withdraw sucessfully...!");
					System.out.println("Your current balance is: "+ am);
				}
			}
		}
	}
	
	// Method for displaying the transactions
	public void transaction() {
		for(Transaction t : transactionHistory) {
			System.out.println(t.toString());
		}
	}
}
