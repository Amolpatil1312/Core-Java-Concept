package com.csi.core;

import java.util.Scanner;

public class ForLoopConcept {

	public static void main(String[] args) {

		// Take input from end user as Company name and ask how many times want to print

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter company name and how many times you want to print: ");

		String companyName = scanner.nextLine();

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(companyName);
		}
	}

}
