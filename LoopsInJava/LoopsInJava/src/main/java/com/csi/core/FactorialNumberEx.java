package com.csi.core;

public class FactorialNumberEx {

	public static void main(String[] args) {

		int fact = 1, n = 5;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("\n Factorial Result: " + fact);
	}

}
