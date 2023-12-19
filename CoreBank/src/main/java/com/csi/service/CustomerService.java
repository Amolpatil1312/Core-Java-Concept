package com.csi.service;

import java.util.Scanner;

public class CustomerService {

	Scanner scanner = new Scanner(System.in);

	int customerAccountBalance = 10000;

	int amount, otp, generatedOTP;

	public void deposit() {

		System.out.println("\n Before Deposit Customer Account Balance: " + customerAccountBalance);

		System.out.println("\n Please enter amount for deposit: ");

		amount = scanner.nextInt();

		customerAccountBalance += amount;

		System.out.println("\n After Deposit Cust Acc Balance: " + customerAccountBalance);
	}

	public void withdraw() {

		System.out.println("\n Before withdraw Customer Acc Balance: " + customerAccountBalance);

		System.out.println("\n Please enter amount for withdraw: ");

		amount = scanner.nextInt();

		if (amount < customerAccountBalance) {

			customerAccountBalance -= amount;

			System.out.println("\n After withdraw Customer Account Balance: " + customerAccountBalance);

		} else {
			System.out.println("Insufficient fund");
		}
	}

	public void transfer() {

		System.out.println("\n Before Transfer Cust Acc Balance: " + customerAccountBalance);

		System.out.println("\n Please enter amount for transfer: ");
		amount = scanner.nextInt();

		if (amount < customerAccountBalance) {

			otp = generateOTP();

			System.out.println("\n Please enter otp: " + otp);

			generatedOTP = scanner.nextInt();

			if (otp == generatedOTP) {

				customerAccountBalance -= amount;

				System.out.println("\n Amont Transfer Successfully");

				System.out.println("\n After transfer Acc Balance: " + customerAccountBalance);
			} else {
				System.out.println("Invalid OTP");
			}

		} else {
			System.out.println("Insufficient fund");
		}
	}

	public void logout() {

		System.out.println("Logout Successfully");
		System.exit(0);
	}

	int generateOTP() {
		return (int) (Math.random() * 9000 + 1000);
	}

}
