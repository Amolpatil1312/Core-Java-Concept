package com.fullstack.core;

class Singleton {

	private Singleton() {

	}

	private static Singleton singletonInstance = new Singleton();

	public static Singleton getSingletonInstance() {
		return singletonInstance;
	}
}

public class SingletoneDesignPatternEx {

	public static void main(String[] args) {

		Singleton singleton1 = Singleton.getSingletonInstance();
		System.out.println(singleton1.hashCode());
		Singleton singleton2 = Singleton.getSingletonInstance();
		System.out.println(singleton2.hashCode());
	}

}
