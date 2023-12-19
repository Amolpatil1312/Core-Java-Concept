package com.csi.core;

public class StringBasics {

	public static void main(String[] args) {
		String s1 = null;// SCP

		String s2 = new String("FINTECH");// Heap
		
		if(s1!=null && s1.isEmpty()) {
			System.out.println("Empty");
		}else {
			System.out.println("Not Empty");
		}

		//System.out.println(s1.compareTo(s2));
		//System.out.println(s1.isEmpty());

		/*
		 * System.out.println(s1 == s2); System.out.println(s1.equals(s2));
		 * System.out.println(s1.equalsIgnoreCase(s2));
		 */

		// System.out.println(s1.charAt(2));

		// System.out.println(s1.length());

		// System.out.println(s1.concat(s2));

		// s1.concat(s2);// Immutable

		// System.out.println(s1);

		StringBuffer buffer1 = new StringBuffer("CSI");
		StringBuffer buffer2 = new StringBuffer("CSI");

		// buffer1.append(buffer2);// Mutable

		// System.out.println(buffer1);

		StringBuilder builder1 = new StringBuilder("JAVA");
		StringBuilder builder2 = new StringBuilder("REACT");

		// builder1.append(builder2);// Mutable

		// System.out.println(builder1);

		// System.out.println(builder1.reverse());

		// System.out.println(buffer1.reverse());

	}

}
