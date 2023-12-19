package com.csi.core;

import java.util.Scanner;

public class IfElseConcept {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter marks: ");
		int marks = scanner.nextInt();

		if (marks >= 60) {
			System.out.println("\n Eligible for campus");
		} else {
			System.out.println("\n Not Eligible for campus");
		}
	}
}
