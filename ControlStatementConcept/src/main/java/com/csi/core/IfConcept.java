package com.csi.core;

import java.util.Scanner;

public class IfConcept {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter age: ");

		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("Eligible for vote");
		} else {
			System.out.println("Not Eligible for vote");
		}
	}

}
