package com.csi.core;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter 3 number: ");

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is greater: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("n2 is greater: " + n2);

		}else if(n1==n2) {
			System.out.println("n1 & n2 both are same");
		}
		else {
			System.out.println("n3 is greater: " + n3);
		}

	}

}
