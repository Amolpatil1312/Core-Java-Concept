package com.csi.core;

import java.util.Scanner;

public class NestedIfElseConcept {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter marks: ");

		int marks = scanner.nextInt();

		if (marks >= 68) {
			System.out.println("FIRST CLASS WITH DISTINCTION");
		} else if (marks < 68 && marks >= 60) {
			System.out.println("FIRST CLASS");
		} else if (marks < 60 && marks >= 55) {
			System.out.println("HIGHER SECOND CLASS");
		} else if (marks < 55 && marks >= 50) {
			System.out.println("SECOND CLASS");
		} else if (marks < 50 && marks >= 40) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		scanner.close();
	}

}
