package com.sriindu.bank.transaction;

import java.util.Scanner;

public class TransactionMain {
	TransactionService transaction=new TransactionService();
	Scanner scanner=new Scanner(System.in);
	public void manageTransaction() {
		Transaction tnx=new Transaction(1,101,"Deposit",1000);
		Transaction tnx2=new Transaction(2,102,"Withdrwal",2000);
		transaction.addTrasaction(tnx);
		transaction.addTrasaction(tnx2);
		transaction.displayTransaction();
		
	}
	
	public void fetchTransactionByAccountId(Scanner scanner) {
		int accountID=scanner.nextInt();
		transaction.getTransactionByAccountId(accountID);
		
	}

}
