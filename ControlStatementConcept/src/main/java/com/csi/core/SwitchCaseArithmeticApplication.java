package com.csi.core;

import java.util.Scanner;

public class SwitchCaseArithmeticApplication {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter 2 number: ");

		int n1 = scanner.nextInt(), n2 = scanner.nextInt(), result = 0;

		System.out.println(
				"\n Please enter your choice: \n 1. Addition \n 2. Substraction \n 3. Multiplication \n 4. Division");

		int ch = scanner.nextInt();

		switch (ch) {
		case 1:// add

			result = n1 + n2;
			System.out.println("\n Addition Result: " + result);

			break;
		case 2:// sub
			result = n1 - n2;
			System.out.println("\n Substraction Result: " + result);

			break;
		case 3:// mul
			result = n1 * n2;
			System.out.println("\n Multiplication Result: " + result);

			break;
		case 4:// div
			result = n1 / n2;
			System.out.println("\n Division Result: " + result);

			break;

		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

}
