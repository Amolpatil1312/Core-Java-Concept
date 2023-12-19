package com.csi.core;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		Set<String> branchSet = new TreeSet<String>();

		branchSet.add("1001");
		branchSet.add("IT");
		branchSet.add("COMPUTER");
		branchSet.add("E&TC");
		branchSet.add("CIVIL");
		branchSet.add("IT");

		branchSet.add("MECHANICAL");
		branchSet.add("ELECTRICAL");
		branchSet.add("PETROLIUM");
		branchSet.add("22");
		branchSet.add("CHEMICAL");

		/*
		 * Iterator<String> iterator = branchSet.iterator();
		 * 
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */

		/*
		 * for (String branch : branchSet) { System.out.println(branch); }
		 */

		// branchSet.forEach(b-> System.out.println(b));

		branchSet.forEach(System.out::println);
	}

}
