package com.task5;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

	private String accountHolder;
	private String accountNumber;
    private double balance;
    List<String> transactionHistory;
    
	public Accounts(String accountHolder, String accountNumber, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactionHistory = new ArrayList<>();
	}
    
    public Accounts() {
    	
    }
    
	@Override
	public String toString() {
		return "Accounts [accountHolder=" + accountHolder + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}  
}
