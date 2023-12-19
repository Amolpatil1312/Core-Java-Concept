package com.csi.model;

public class Customer {

	private long customerAccountNumber;

	private String customerPassword;

	public Customer(long customerAccountNumber, String customerPassword) {
		super();
		this.customerAccountNumber = customerAccountNumber;
		this.customerPassword = customerPassword;
	}

	public long getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

}
