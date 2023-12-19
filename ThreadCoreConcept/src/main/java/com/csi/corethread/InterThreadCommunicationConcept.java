package com.csi.corethread;

class Customer {

	int accountBalance = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("Going to withdraw=> " + amount);
		if (amount > accountBalance) {
			System.out.println("Insufficient fund, please wait to deposit money");

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		accountBalance -= amount;

		System.out.println("\n Withdraw amount successfully: " + accountBalance);

	}

	synchronized void deposit(int amount) {

		System.out.println("Going to deposit money=> 25000/-");

		accountBalance += amount;
		System.out.println("Amount Deposited Successfully: " + accountBalance);

		notify();
	}
}

public class InterThreadCommunicationConcept {

	public static void main(String[] args) {

		Customer customer = new Customer();

		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				customer.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				customer.deposit(25000);
			};
		}.start();

	}

}
