package com.csi.oops.encapsulationconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Customer {
	private int custId;

	private String custName;

	private String custAddress;

	private long custContactNumber;

	private double custAccountBalance;

	private String custPanCardNumber;

	private long custUID;

	private Date custDOB;

	private String custEmailId;

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

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
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

	public String getCustPanCardNumber() {
		return custPanCardNumber;
	}

	public void setCustPanCardNumber(String custPanCardNumber) {
		this.custPanCardNumber = custPanCardNumber;
	}

	public long getCustUID() {
		return custUID;
	}

	public void setCustUID(long custUID) {
		this.custUID = custUID;
	}

	public Date getCustDOB() {
		return custDOB;
	}

	public void setCustDOB(Date custDOB) {
		this.custDOB = custDOB;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", custContactNumber=" + custContactNumber + ", custAccountBalance=" + custAccountBalance
				+ ", custPanCardNumber=" + custPanCardNumber + ", custUID=" + custUID + ", custDOB=" + custDOB
				+ ", custEmailId=" + custEmailId + "]";
	}

}

public class CustMgntApplication {

	public static void main(String[] args) {

		Customer customer = new Customer();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dobDate = null;

		try {
			dobDate = simpleDateFormat.parse("09/09/2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		customer.setCustId(111);
		customer.setCustName("SWARA");
		customer.setCustAddress("PUNE");
		customer.setCustAccountBalance(98000.22);
		customer.setCustContactNumber(9898989886L);
		customer.setCustPanCardNumber("ARDG8754B");
		customer.setCustUID(454523237878L);
		customer.setCustDOB(dobDate);
		customer.setCustEmailId("SWARA@FINTECH.COM");

		// System.out.println(customer);

		System.out.println("\n Customer ID: " + customer.getCustId() + "\n Customer Name: " + customer.getCustName()
				+ "\n Customer Address: " + customer.getCustAddress() + "\n Customer Contact Number: "
				+ customer.getCustContactNumber() + "\n Customer Account Balance: " + customer.getCustAccountBalance()
				+ "\n Customer Pan Card: " + customer.getCustPanCardNumber() + "\n Customer UID: "
				+ customer.getCustUID() + "\n Customer DOB: " + customer.getCustDOB() + "\n Customer Email ID: "
				+ customer.getCustEmailId());

	}

}
