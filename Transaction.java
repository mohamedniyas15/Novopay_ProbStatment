package com.niyas;

public class Transaction {
	
	private int transactionId;
	private int transactedAmount;
	private String fromWallet;
	private String toWallet;
	private String name;
	private String status;
	
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getTransactedAmount() {
		return transactedAmount;
	}
	public void setTransactedAmount(int transactedAmount) {
		this.transactedAmount = transactedAmount;
	}
	public String getFromWallet() {
		return fromWallet;
	}
	public void setFromWallet(String fromWallet) {
		this.fromWallet = fromWallet;
	}
	public String getToWallet() {
		return toWallet;
	}
	public void setToWallet(String toWallet) {
		this.toWallet = toWallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
