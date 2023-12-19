package com.csi.core;

public class ArithmeticApplication {
	public static void main(String[] args) {

		ArithmeticApplication app = new ArithmeticApplication();

		System.out.println("\n Addition Result: " + app.add(4, 5));

		app.sub(20, 10);

		System.out.println("\n Multiplication Result: " + mul(4, 5));

		System.out.println("\n Division Result: " + app.div(8, 2));

	}

	int add(int n1, int n2) {
		return n1 + n2;
	}

	void sub(int n1, int n2) {
		System.out.println("\n Substraction Result: " + (n1 - n2));
	}

	static int mul(int n1, int n2) {
		return n1 * n2;
	}

	float div(int n1, int n2) {
		return n1 / n2;
	}
}
