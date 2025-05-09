package com.sriindu.java.Bank;

public class BankMain {

	public static void main(String[] args) throws  InsufficientFundsException,InvalidAmountException{
		Bank ob=new Bank();
		
		 try {
		        ob.deposit(50000);
		        ob.withdraw(30000);
		    } catch (InvalidAmountException e) {
		        System.out.println("Enter valid amount to deposit: " + e.getMessage());
		    } catch (InsufficientFundsException e) {
		        System.out.println("Insufficient amount to withdraw: " + e.getMessage());
		    }
		}
}
