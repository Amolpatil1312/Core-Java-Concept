package com.csi.core;

import java.util.Optional;

public class StringNullCheckEx {

	public static void main(String[] args) {

		String name = "FINTECH";

		/*
		 * if(name!=null) { System.out.println(name.length()); }else {
		 * System.out.println("String is NULL"); }
		 */

		Optional<String> cName = Optional.ofNullable(name);

		if (cName.isPresent()) {
			System.out.println(name.length());
		} else {
			System.out.println("String is NULL");
		}
	}

}
