package com.sriindu.bank.transaction;

public interface TransactionOperation {
	
	void  addTrasaction(Transaction transaction);
	void displayTransaction();
	void getTransactionByAccountId(int accountID);

}
