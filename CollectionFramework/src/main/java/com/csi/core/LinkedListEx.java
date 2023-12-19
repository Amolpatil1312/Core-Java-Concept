package com.csi.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		List<String> branchList = new LinkedList<String>();

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
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */

		/*
		 * for (String branch : branchList) { System.out.println(branch); }
		 */

		// branchList.forEach(b-> System.out.println(b));

		branchList.forEach(System.out::println);

	}

}
