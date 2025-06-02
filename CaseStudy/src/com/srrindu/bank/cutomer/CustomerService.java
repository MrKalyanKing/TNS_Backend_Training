package com.srrindu.bank.cutomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService implements CustomerOperation {
	
	private List <Customer> customers=new ArrayList<>();

	@Override
	public void addCustomer(Customer customer) {
		customers.add(customer);
		System.out.println(customer);
		
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayCustomer() {
		System.out.println("Customer List");
		for(Customer customer:customers) {
			System.out.println(customer);
		}
		
	}

	@Override
	public void getcustomerById(int customerID) {
		System.out.println("\n===  Customer By  ID: " + customerID + "");
		boolean found=false;
		for(Customer css:customers) {
			if(css.getCustomerID() == customerID) {
				System.out.println(css);
				found=true;
			}
		}
		if(!found) {
			System.out.println("No Customer found for Customer ID: " + customerID);
		}

		
	}

}
