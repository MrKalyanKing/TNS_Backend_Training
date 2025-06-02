package com.srrindu.bank.cutomer;

import java.util.Scanner;

public class CustomerMain {

	
		CustomerService customersrv=new CustomerService();
		Scanner scanner=new Scanner(System.in);
		public void manageCustomer() {
		
		Customer cus1=new Customer(1,"Kalyan","Kamareddy 503144","9302491012");
		
		customersrv.addCustomer(cus1);
//		customersrv.displayCustomer();
		}
		public void fetchCustomerById(Scanner scanner) {
			int customerID=scanner.nextInt();
			customersrv.getcustomerById(customerID);
			
		}
	}

