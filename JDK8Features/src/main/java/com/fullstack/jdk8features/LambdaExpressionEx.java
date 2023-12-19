package com.fullstack.jdk8features;

@FunctionalInterface//SAM
interface Customer {
	void get(int n1, int n2);
	
	static void set() {
		//
		//
	}
	
	default void net() {
		
	}
	
	default void foo() {
		
	}

}

public class LambdaExpressionEx {

	public static void main(String[] args) {

		Customer customer = (int n1, int n2) -> System.out.println(n1 + n2);

		customer.get(10, 20);
	}

}
