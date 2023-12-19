package com.csi.core;

public class ExceptionBasics {

	public static void main(String[] args) {

		try {
			// System.exit(0);
			// int result = 10 / 0;
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception

			e.printStackTrace();
		} finally {

			// Realtime usage- DB Connection close, Hibernate session close
			System.out.println("Always Execute");
		}

		isAgeValidToDoVote(17);

	}

	static void isAgeValidToDoVote(int age) {

		if (age >= 18) {
			System.out.println("ELIGIBLE FOR VOTE");
		} else {
			throw new ArithmeticException("Age is not valid to do vote");
		}
	}

}
