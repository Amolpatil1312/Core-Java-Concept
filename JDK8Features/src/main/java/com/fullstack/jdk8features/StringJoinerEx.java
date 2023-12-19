package com.fullstack.jdk8features;

import java.util.StringJoiner;

public class StringJoinerEx {
	
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(" $ ");
		joiner.add("TCS");
		joiner.add("INFY");
		joiner.add("WIPRO");
		
		System.out.println(joiner);
	}

}
