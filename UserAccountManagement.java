package com.niyas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserAccountManagement {
	
	List<UserAccount>  userAccounts = new ArrayList<UserAccount>();
	
	public void register(UserAccount account){
		
		userAccounts.add(account);
		
	}
	
	public int doTransaction(UserAccount account, int amount, String fromWallet, String toWallet){
		
		HashMap<String,Wallet> wallets =  account.getWallets();
		Wallet from = wallets.get(fromWallet);
		int frommoney = from.getMoney();
		from.setMoney(frommoney-amount);
		Wallet to = wallets.get(fromWallet);
		int tomoney = to.getMoney();
		to.setMoney(tomoney+amount);

		HashMap<String,Transaction> transactions = account.getTransactions();
	    Transaction tr = new Transaction();
	    tr.setFromWallet(fromWallet);
	    tr.setToWallet(toWallet);
	    tr.setTransactedAmount(amount);
	    tr.setStatus("success");
	    tr.setTransactionId(123);
	    transactions.put(tr.getTransactionId()+"",tr);
	    
	    return tr.getTransactionId();
	}
	
	public void reverseTransaction(UserAccount account, int transactionId){
		HashMap<String,Transaction> transactions = account.getTransactions();
		Transaction tr = transactions.get(transactionId+"");
		Wallet to  = account.getWallets().get(tr.getFromWallet());
		Wallet from = account.getWallets().get(tr.getToWallet());
		int frommoney = from.getMoney();
		from.setMoney(frommoney-tr.getTransactedAmount());
		int tomoney = to.getMoney();
		to.setMoney(tomoney+tr.getTransactedAmount());
	}
	
	public String getTransactionStatus(UserAccount account, int transactionId){
		
		return account.getTransactions().get(transactionId+"").getStatus();
	}
	
	public void viewPassBook(UserAccount account){
		
		System.out.println(account);
		
	}
	
	public static void main(String[] args){
		
		UserAccountManagement uAM = new UserAccountManagement();
		
		UserAccount uA = new UserAccount();
		uA.setFirstName("Niyas");
		uA.setLastName("Meeran");
		uA.setAccountNumber(123);
		Wallet wallet = new Wallet();
		Wallet wallet2 = new Wallet();
		wallet.setMoney(1000);
		wallet.setName("Wallet1");
		wallet2.setMoney(2000);
		wallet2.setName("Wallet2");
		HashMap<String, Wallet>  wallets = new HashMap<String, Wallet>();
		wallets.put(wallet.getName(),wallet);
		wallets.put(wallet2.getName(),wallet2);
		uA.setWallets(wallets);
		
		
		//Registering User Account
		uAM.register(uA);
		
		//Transaction
		int transactionId  = uAM.doTransaction(uA, 500, wallet.getName(), wallet2.getName());
		
		//getTransactionStatus
		String status = uAM.getTransactionStatus(uA, transactionId);
		System.out.println(status);
		
		//reversing the transaction
		uAM.reverseTransaction(uA,transactionId);
		
		//ViewingPassBook
		uAM.viewPassBook(uA);
		
	}

}
