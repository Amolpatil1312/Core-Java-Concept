package com.csi.core;

public class PalindromeStringEx {

	public static void main(String[] args) {
		String orgString = "MADAM";

		String revString = "";
		for (int i = orgString.length() - 1; i >= 0; i--) {

			revString = revString + orgString.charAt(i);

		}

		if (orgString.equals(revString)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
