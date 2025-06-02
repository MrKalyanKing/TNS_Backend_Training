package com.sriindu.bank.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionService implements TransactionOperation {
    List <Transaction> transaction=new ArrayList<>();
    
	public void addTrasaction(Transaction transactions) {
		transaction.add(transactions);
		
	}

	@Override
	public void displayTransaction() {
		if(transaction.isEmpty()) {
			System.out.println("No Transaction found\n");
			
		}
		else {
			for(Transaction tnx:transaction) {
				System.out.println(tnx);
			}
		}
		
	}

	@Override
	public void getTransactionByAccountId(int accountID) {
		System.out.println("\n=== Transaction  for account ID: " + accountID + "");
		boolean found=false;
		for (Transaction tnx: transaction) {
			if (tnx.getAccountID() == accountID) {
				System.out.println(tnx);
				found=true;
			}
		}
		 if(!found) {
				System.out.println("No Transaction found for Account ID: " + accountID);
			}
			
	}

}
