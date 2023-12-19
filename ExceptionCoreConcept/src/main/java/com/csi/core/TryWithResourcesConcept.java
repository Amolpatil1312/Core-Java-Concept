package com.csi.core;

import java.util.Scanner;

public class TryWithResourcesConcept {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("\n Please enter Company Name: ");

			String companyName = scanner.nextLine();

			System.out.println(companyName);
		}

	}

}
