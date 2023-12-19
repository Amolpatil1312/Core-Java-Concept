package com.fullstack.core;

@FunctionalInterface // SAM
interface Product {

	void get();

	static void set() {
		System.out.println("I am from static method");
	}

	default void net() {
		System.out.println("I am from default method");

	}

}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Product product = () -> {
			System.out.println("Hello");
		};

		product.get();
		product.net();
		Product.set();
	}

}
