package com.csi.core;

import java.util.Scanner;

public class EnumConcept {

	enum Tier {
		TCS, INFOSYS, WIPRO
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter Company Name: ");

		String companyName = scanner.next();

		boolean flag = false;
		for (Tier t : Tier.values()) {
			if (t.toString().equals(companyName)) {
				flag = true;
				System.out.println("Yes its in TOP 3 tier");
				break;
			} else {
				flag = false;

			}
		}

		if (!flag) {
			System.out.println("Not in TOP 3 tier");
		}

	}

}
