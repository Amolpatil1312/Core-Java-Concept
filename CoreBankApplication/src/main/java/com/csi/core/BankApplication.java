package com.csi.core;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		BankApplication application = new BankApplication();

		long customerAccountNumber = 12345;

		String customerPassword = "FINTECH";

		int customerAccountBalance = 10000, amount, otp, endUserOTP;

		Scanner scanner = new Scanner(System.in);

		boolean flag = false;

		do {

			System.out.println("\n Please enter acc no & pwd: ");

			long custAccNo = scanner.nextLong();

			String custPwd = scanner.next();

			if (customerAccountNumber == custAccNo && customerPassword.equals(custPwd)) {
				System.out.println("\n WELCOME TO INDIAN BANK");
				flag = false;
			} else {
				flag = true;
				System.out.println("Invalid Credentials");
			}

		} while (flag);
		do {
			System.out.println("\n Please enter your choice: \n 1. deposit \n 2. withdraw \n 3. transfer \n 4. logout");

			int ch = scanner.nextInt();

			switch (ch) {
			case 1: // deposit

				System.out.println("\n Before Deposit Customer Acc Balance: " + customerAccountBalance);

				System.out.println("\n Please enter amount for deposit: ");

				amount = scanner.nextInt();

				customerAccountBalance += amount;

				System.out.println("\n After Deposit Customer Acc Balance: " + customerAccountBalance);
				break;

			case 2: // withdraw

				System.out.println("\n Before Withdraw Customer Acc Balance: " + customerAccountBalance);

				System.out.println("\n Please enter amount for withdraw: ");

				amount = scanner.nextInt();

				if (amount < customerAccountBalance) {
					customerAccountBalance -= amount;
					System.out.println("\n After Withdraw Customer Acc Balance: " + customerAccountBalance);
				} else {
					System.out.println("Insufficient funds");
				}
				break;

			case 3: // transfer

				System.out.println("\n Before Transfer Customer Acc Balance: " + customerAccountBalance);

				System.out.println("\n Please enter amount for transfer: ");
				amount = scanner.nextInt();

				if (amount < customerAccountBalance) {

					otp = application.generatedOTP();

					System.out.println("\n Please enter OTP: " + otp);

					endUserOTP = scanner.nextInt();
					if (otp == endUserOTP) {

						customerAccountBalance -= amount;

						System.out.println("\n After Transfer Customer Acc Balance: " + customerAccountBalance);

					} else {
						System.out.println("Invalid OTP");
					}

				} else {
					System.out.println("Insufficient funds");
				}

				break;

			case 4: // logout

				System.out.println("\n Logout Successfully");
				System.exit(0);

				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}
		} while (true);
	}

	 int generatedOTP() {
		return (int) (Math.random() * 9000 + 1000);
	}

}
