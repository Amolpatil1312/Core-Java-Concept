package com.csi.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {

		List<String> branchList = new ArrayList<String>();

		branchList.add("IT");
		branchList.add("COMPUTER");
		branchList.add("E&TC");
		branchList.add("CIVIL");
		branchList.add("IT");
		branchList.add("MECHANICAL");
		branchList.add("ELECTRICAL");
		branchList.add("PETROLIUM");
		branchList.add("CHEMICAL");

		/*
		 * Iterator<String> iterator = branchList.iterator();
		 * 
		 * while (iterator.hasNext()) {
		 * 
		 * System.out.println(iterator.next()); }
		 */

		for (String s : branchList) {

			System.out.println(s);

		}

		// branchList.forEach(System.out::println);

		//branchList.forEach(branch -> System.out.println(branch));
	}

}
