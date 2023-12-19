package com.csi.stringcore;

public class StringBasics {

	public static void main(String[] args) {
		String s1 = "FullStack";
		String s2 = new String("FullStack");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.length());
		s1.concat(s2);
		System.out.println(s1);
		System.out.println(s1.compareTo(s2));
		
		//System.out.println(s1.);

	}

}
