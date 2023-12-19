package com.csi.core;

public class ExceptionScenario {
	public static void main(String[] args) {

		System.out.println(get());
	}

	static int get() {
		int result = 10;
		try {
			result = 10 / 0;
 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		} finally {
			System.out.println("I am from finally");

		}
		
		return result;
	}
}
