package com.csi.core;

public class PalindromeString {

	public static void main(String[] args) {

		String name = "madam";

		String rev = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);
		}

		System.out.println(name.equals(rev) ? "Palindrome" : "Not Palindrome");

		/*
		 * if (name.equalsIgnoreCase(rev)) System.out.println("Palindrome"); else
		 * System.out.println("Not Palindrome");
		 */

	}

}
