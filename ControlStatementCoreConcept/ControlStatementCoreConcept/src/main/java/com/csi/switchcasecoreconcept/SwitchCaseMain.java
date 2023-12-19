package com.csi.switchcasecoreconcept;

import java.util.Scanner;

public class SwitchCaseMain {

	public static void main(String[] args) {

		Service service = new Service();

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter 2 number: ");

		int n1 = scanner.nextInt();

		int n2 = scanner.nextInt();

		System.out.println(
				"\n Please enter your choice: \n 1. Addition \n 2. Substarction \n 3. Multiplication \n 4. Division");

		int ch = scanner.nextInt();

		switch (ch) {
		case 1:

			service.add(n1, n2);
			break;

		case 2:
			service.sub(n1, n2);
			break;

		case 3:
			service.mul(n1, n2);
			break;

		case 4:
			service.div(n1, n2);
			break;

		default:
			break;
		}
	}

}
