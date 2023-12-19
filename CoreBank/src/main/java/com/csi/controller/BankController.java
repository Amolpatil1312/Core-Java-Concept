package com.csi.controller;

import java.util.Scanner;

import com.csi.model.Customer;
import com.csi.service.CustomerService;

public class BankController {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		CustomerService customerService = new CustomerService();

		Customer customer = new Customer(12345, "CSI");

		boolean flag = false;
		do {
			System.out.println("\n Please enter account number & password: ");

			long custAccNumber = scanner.nextLong();

			String custPassword = scanner.next();

			if (customer.getCustomerAccountNumber() == custAccNumber
					&& customer.getCustomerPassword().equals(custPassword)) {
				flag = false;
				System.out.println("WELCOME TO INDIAN BANK");
			} else {
				flag = true;
				System.out.println("\n Invalid Credentials! please try again!!!!");
			}
		} while (flag);

		do {
			System.out.println("\n Please enter your choice: \n 1. deposit \n 2. withdraw \n 3. transfer \n 4. logout");

			int ch = scanner.nextInt();

			switch (ch) {
			case 1: // deposit

				customerService.deposit();

				break;

			case 2: // withdraw

				customerService.withdraw();

				break;

			case 3: // transfer

				customerService.transfer();

				break;

			case 4: // logout

				customerService.logout();

				break;

			default:
				break;
			}
		} while (true);
	}

}
