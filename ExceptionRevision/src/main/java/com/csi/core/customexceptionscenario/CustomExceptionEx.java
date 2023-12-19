package com.csi.core.customexceptionscenario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer {
	private int custId;

	private String custName;

	private long custContactNumber;

	private double custAccountBalance;

	public Customer(int custId, String custName, long custContactNumber, double custAccountBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custContactNumber = custContactNumber;
		this.custAccountBalance = custAccountBalance;
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

	public long getCustContactNumber() {
		return custContactNumber;
	}

	public void setCustContactNumber(long custContactNumber) {
		this.custContactNumber = custContactNumber;
	}

	public double getCustAccountBalance() {
		return custAccountBalance;
	}

	public void setCustAccountBalance(double custAccountBalance) {
		this.custAccountBalance = custAccountBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custContactNumber=" + custContactNumber
				+ ", custAccountBalance=" + custAccountBalance + "]";
	}

}

public class CustomExceptionEx {

	public static void main(String[] args)throws ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException {

		
		List<Customer> customers = Stream.of(new Customer(121, "RAM", 119898998, 95000),
				new Customer(122, "SWARA", 229898998, 65000), new Customer(124, "LAKSHMI", 339898998, 75000),
				new Customer(127, "DAN", 449898998, 15000), new Customer(129, "VENKAT", 559898998, 85000))
				.collect(Collectors.toList());

		System.out.println("\n Please enter customer id for search: ");

		Scanner scanner = new Scanner(System.in);

		int customerId = scanner.nextInt();

		boolean flag = false;

		for (Customer customer : customers) {
			if (customer.getCustId() == customerId) {
				System.out.println(customer);
				flag = true;
				break;

			}
		}

		if (!flag) {
			throw new RecordNotFoundException("Customer ID Does not exist");
		}
	}

}
