package com.csi.core;

public class ExceptionBasics {

	public static void main(String[] args) {

		String name = null;
		try {

			System.out.println(name.length());
			int result = 10 / 0;

		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("Always execute");
		}

	}

}
