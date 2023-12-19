package com.csi.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer {
	private int custId;

	private String custName;

	private int custAge;

	private double custAccountBalance;

	public Customer(int custId, String custName, int custAge, double custAccountBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAge = custAge;
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

	public int getCustAge() {
		return custAge;
	}

	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}

	public double getCustAccountBalance() {
		return custAccountBalance;
	}

	public void setCustAccountBalance(double custAccountBalance) {
		this.custAccountBalance = custAccountBalance;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge
				+ ", custAccountBalance=" + custAccountBalance + "]";
	}

}

class NameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		return c1.getCustName().compareTo(c2.getCustName());
	}

}

class AgeComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if (c1.getCustAge() == c2.getCustAge()) {
			return 0;
		} else if (c1.getCustAge() > c2.getCustAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class AcountBalanceComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if (c1.getCustAccountBalance() == c2.getCustAccountBalance()) {
			return 0;
		} else if (c1.getCustAccountBalance() > c2.getCustAccountBalance()) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparatorConcept {

	public static void main(String[] args) {

		List<Customer> custList = new ArrayList<Customer>();

		custList.add(new Customer(121, "SWARA", 16, 65000));
		custList.add(new Customer(122, "RAM", 22, 35000));
		custList.add(new Customer(123, "SNEHAL", 45, 15000));
		custList.add(new Customer(129, "VENKAT", 17, 95000));
		custList.add(new Customer(191, "POOJA", 21, 85000));

		System.out.println("########NAME COMPARATOR#########");
		Collections.sort(custList, new NameComparator());
		custList.forEach(System.out::println);

		System.out.println("\n ########AGE COMPARATOR#########");
		Collections.sort(custList, new AgeComparator());
		custList.forEach(System.out::println);

		System.out.println("\n ########Account Balance COMPARATOR#########");
		Collections.sort(custList, new AcountBalanceComparator());
		custList.forEach(System.out::println);

	}

}
