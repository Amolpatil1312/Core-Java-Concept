package com.csi.core;

public class StringBasics {

	public static void main(String[] args) {

		String s1 = "FULLSTACK";

		String s2 = new String("FULLSTACK");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		System.out.println(s1.charAt(2));
		System.out.println(s1.length());

		System.out.println(s1.compareTo(s2));

		s1.concat(s2);// Immutable

		StringBuffer buffer1 = new StringBuffer("REACT");

		StringBuffer buffer2 = new StringBuffer("REACT");

		// buffer1.append(buffer2);// Mutable

		System.out.println(buffer1.reverse());

		StringBuilder builder1 = new StringBuilder("JAVA");
		StringBuilder builder2 = new StringBuilder("JAVA");
		builder1.append(builder2);// Mutable
		System.out.println(builder1);

	}

}
