package com.sriindu.bank.transaction;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

	private int transactionID;
	private int accountID;
	private String type;
	private double amount;
	private LocalDateTime timestamp;
	
	public Transaction(int transactionID, int accountID, String type, double amount ) {
		super();
		this.transactionID = transactionID;
		this.accountID = accountID;
		this.type = type;
		this.amount = amount;
		this.timestamp =LocalDateTime.now();
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	// ToString method for individual transaction details
    public String toString() {
        return "Transaction ID: " + transactionID + ", Type: " + type + ", Amount: " + amount + ", Timestamp: " + timestamp;
    }

    // ToString method for displaying transactions grouped by Account ID
    public String toStringByAccount() {
        return "Account ID: " + accountID + " | Transaction ID: " + transactionID + " | Type: " + type + " | Amount: " + amount + " | Timestamp: " + timestamp;
    }
    
    public String getTimestampIST() {
        ZonedDateTime istTime = timestamp.atZone(ZoneId.of("Asia/Kolkata")); // Convert to IST
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // Format timestamp
        return istTime.format(formatter);
    }


}
