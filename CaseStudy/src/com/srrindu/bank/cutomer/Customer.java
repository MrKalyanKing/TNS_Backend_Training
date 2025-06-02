package com.srrindu.bank.cutomer;

public class Customer {
	
	private int customerID;
	private String name;
	private String address;
	private String contact;
	public int getCustomerID() {
		return customerID;
	}
	public Customer(int customerID, String name, String address, String contact) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "customerID=" +customerID + "\n" + " name=" + name + "\n" + " address=" + address + "\n"+  " contact=" + contact
				;
	}

}
