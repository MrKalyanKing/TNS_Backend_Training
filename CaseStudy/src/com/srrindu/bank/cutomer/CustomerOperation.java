package com.srrindu.bank.cutomer;

public interface CustomerOperation {
	
	void addCustomer(Customer customer ) ;
	void deleteCustomer();
	void displayCustomer();
	void getcustomerById(int customerID);

}
