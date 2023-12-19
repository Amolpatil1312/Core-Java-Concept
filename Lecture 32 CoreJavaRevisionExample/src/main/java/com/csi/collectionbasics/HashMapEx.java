package com.csi.collectionbasics;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer {
	

	private int custId;

	private String custName;

	private double custAccountBalance;

	public Customer(int custId, String custName, double custAccountBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
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

	public double getCustAccountBalance() {
		return custAccountBalance;
	}

	public void setCustAccountBalance(double custAccountBalance) {
		this.custAccountBalance = custAccountBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAccountBalance=" + custAccountBalance
				+ "]";
	}

}

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer, Customer> cutstomerMap = new HashMap<Integer, Customer>();
		List<Customer> customerList = Stream
				.of(new Customer(121, "SWARA", 65000.22), new Customer(122, "SWARAJ", 95000)).toList();

		for (Customer customer : customerList) {
			cutstomerMap.put(customer.getCustId(), customer);
		}

		/*
		 * cutstomerMap.forEach((k, v) -> { if (v.getCustAccountBalance() >= 50000.00) {
		 * System.out.println(k + ": " + v); } });
		 */

		/*
		 * for (Map.Entry<Integer, Customer> m : cutstomerMap.entrySet()) { if
		 * (m.getValue().getCustAccountBalance() >= 50000.00) {
		 * System.out.println(m.getKey() + ": " + m.getValue()); } }
		 */
		
		cutstomerMap.entrySet().stream().forEach(System.out::println);

	}

}
