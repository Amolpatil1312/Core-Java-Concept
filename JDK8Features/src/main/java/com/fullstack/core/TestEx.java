package com.fullstack.core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer {

	private int custId;

	private String custName;

	private List<Long> custContactNumber;

	public Customer(int custId, String custName, List<Long> custContactNumber) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custContactNumber = custContactNumber;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public List<Long> getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(List<Long> custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custContactNumber=" + custContactNumber
				+ "]";
	}

}

public class TestEx {

	public static void main(String[] args) {

		List<Customer> customerList = Stream.of(new Customer(121, "SWARA", Arrays.asList(989898788L, 45454545L)),
				new Customer(122, "RAM", Arrays.asList(119898788L, 22454545L))).collect(Collectors.toList());

		List<List<Long>> contactNumbers = customerList.stream().map(customer -> customer.getCustContactNumber())
				.collect(Collectors.toList());

		System.out.println(contactNumbers);

		List<Long> contactNumber = customerList.stream().flatMap(customer -> customer.getCustContactNumber().stream())
				.collect(Collectors.toList());
		System.out.println(contactNumber);
	}

}
