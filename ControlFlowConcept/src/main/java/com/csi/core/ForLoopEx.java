package com.csi.core;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter company name & how many times you want to print: ");

		String companyName = scanner.nextLine();

		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(companyName);
		}
	}

}
