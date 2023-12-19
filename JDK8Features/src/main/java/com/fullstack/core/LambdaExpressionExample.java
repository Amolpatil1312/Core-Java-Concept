package com.fullstack.core;

interface Customers {

	void get(int n1, int n2);

}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		Customers customer = (int n1, int n2) -> System.out.println(n1 * n2);

		customer.get(4, 5);
	}

}
