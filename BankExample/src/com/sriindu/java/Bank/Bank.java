package com.sriindu.java.Bank;

public class Bank implements BankImplement {
	private  double balance=20000;
	
	 public void deposit(double amount) throws InvalidAmountException {
	        if (amount >= 0 && amount >=DEPOSIT_AMT) {
	            throw new InvalidAmountException("Amount must be greater than 0 and Exceeding the deposit limit");
	        }
	        balance += amount;
	        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
	    }
  
	 public void withdraw(double amount) throws InsufficientFundsException {
	        if (amount > balance) {
	            throw new InsufficientFundsException("Not enough balance");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
	    };
}
