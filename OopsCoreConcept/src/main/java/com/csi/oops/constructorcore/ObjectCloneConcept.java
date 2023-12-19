package com.csi.oops.constructorcore;

class Customer implements Cloneable {

	private int custId;

	private String custName;

	private double custAccpountBalance;

	public Customer(int custId, String custName, double custAccpountBalance) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAccpountBalance = custAccpountBalance;

		//System.out.println("" + custId + "" + custName + "" + custAccpountBalance);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAccpountBalance=" + custAccpountBalance
				+ "]";
	}
	
	
}

public class ObjectCloneConcept {

	public static void main(String[] args) throws CloneNotSupportedException {

		Customer customer = new Customer(121, "SWARA", 98000);
		
		Customer customer2 = (Customer) customer.clone();
		
		System.out.println(customer2);
	}

}
