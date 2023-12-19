package com.csi.core;

public class ExceptionScenario {

	public static void main(String[] args) {

		try {
			String name = null;

			int result = 10 / 0;

			System.out.println(name.length());

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
