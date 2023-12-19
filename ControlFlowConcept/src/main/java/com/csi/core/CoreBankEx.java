package com.csi.core;

import java.util.Scanner;

public class CoreBankEx {

	public static void main(String[] args) {

		long custAccountNumber = 12345;

		String custPassword = "CSI";

		Scanner scanner = new Scanner(System.in);

		boolean flag = false;
		do {
			System.out.println("\n Please enter acc no & pwd: ");

			long custAccNumber = scanner.nextLong();

			String custPwd = scanner.next();

			if (custAccountNumber == custAccNumber && custPassword.equals(custPwd)) {

				System.out.println("WELCOME TO INDIAN BANK");
				flag = false;
			} else {
				flag = true;
				System.out.println("Wrong credentials");
			}

		} while (flag);
	}

}
