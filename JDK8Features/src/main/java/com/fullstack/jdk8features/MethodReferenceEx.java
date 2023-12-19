package com.fullstack.jdk8features;

interface Product {
	void get();
}

public class MethodReferenceEx {

	public static void set() {
		System.out.println("I am from set");
		//
		//
	}

	public static void main(String[] args) {

		Product ex = MethodReferenceEx::set;

		ex.get();
	}

}
