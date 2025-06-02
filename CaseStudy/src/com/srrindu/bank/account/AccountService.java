package com.srrindu.bank.account;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements AccountOperation{
 
	List <Account> accounts= new ArrayList<>();
	
	public void addAccount(Account account) {
		accounts.add(account);
//		System.out.println("Account sieze"+ accounts.size());
		
		
	}

	
	public void displayaccounts() {
		if (accounts.isEmpty()) {
			System.out.println("No accounts found");
		}
		else {
			for(Account acc:accounts) {
				System.out.println(acc);
			}
		}
		
	}

	
	public void getAccountsByCustomerID(int customerID) {
		System.out.println("\n=== Accounts for Customer ID: " + customerID + "");
		boolean found=false;
		for (Account acc:accounts) {
			if(acc.getCustomerID() == customerID) {
				System.out.println(acc);
				found=true;
			}
		}
		if(!found) {
			System.out.println("No accounts found for Customer ID: " + customerID);
		}
	}
	

//	
	

}
