package com.niyas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserAccount {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	private HashMap<String,Wallet> wallets = new HashMap<String,Wallet>();

	private HashMap<String,Transaction> transactions = new HashMap<String,Transaction>();
	
	public HashMap<String, Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(HashMap<String, Transaction> transactions) {
		this.transactions = transactions;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public HashMap<String, Wallet> getWallets() {
		return wallets;
	}
	public void setWallets(HashMap<String, Wallet> wallets) {
		this.wallets = wallets;
	}
	public String toString(){
		
		return "User Account :  " + firstName + " " + lastName + "No of Wallets : " + wallets.size()+
				" No of Trasnaction : " + transactions.size() + wallets + " "+ transactions ;
				
	}

}
