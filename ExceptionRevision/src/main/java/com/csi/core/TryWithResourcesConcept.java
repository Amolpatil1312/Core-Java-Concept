package com.csi.core;

import java.util.Scanner;

public class TryWithResourcesConcept {

	public static void main(String[] args) {

		System.out.println("\n Please enter company name: ");
		try (Scanner scanner = new Scanner(System.in)) {
			String companyName = scanner.nextLine();

			System.out.println(companyName);
		}

	}

}
