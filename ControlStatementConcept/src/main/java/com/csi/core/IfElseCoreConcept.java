package com.csi.core;

import java.util.Scanner;

public class IfElseCoreConcept {

	public static void main(String[] args) {

		long customerAccountNumber = 12345;
		String customerPassword = "CSI@2023";

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter acc no & pwd: ");

		long custAccNo = scanner.nextLong();

		String custPwd = scanner.next();

		if (customerAccountNumber == custAccNo && customerPassword.equals(custPwd)) {
			System.out.println("\n WELCOME TO INDIAN BANK");
		} else {
			System.out.println("Wrong credentials");
		}
	}

}
