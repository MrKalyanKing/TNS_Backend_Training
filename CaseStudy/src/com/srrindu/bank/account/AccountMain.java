package com.srrindu.bank.account;

import java.util.Scanner;

public class AccountMain {
	 Scanner scanner = new Scanner(System.in);

	AccountService accountService=new AccountService();
	
	public void manageAccounts() {
		
		Account account1=new Account(101,1,"Saving",8000);
		Account account2=new Account(102,2,"Current",9000);
		accountService.addAccount(account1);
		accountService.addAccount(account2);
		accountService.displayaccounts();
	}

	public void fetchCustomerById(Scanner scanner) {
		int CustomerID=scanner.nextInt();
		accountService.getAccountsByCustomerID(CustomerID);
		
	}
	
//	accountService.displayaccounts();
}
