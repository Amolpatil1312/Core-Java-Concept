package com.csi.core;

import java.util.Scanner;

public class GreaterNumberEx {

	public static void main(String[] args) {

		System.out.println("\n Please enter 3 numbers: ");

		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("\n Greater Number: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("\n Greater Number: " + n2);
		} else {
			System.out.println("\n Greater Number: " + n3);
		}
	}

}
