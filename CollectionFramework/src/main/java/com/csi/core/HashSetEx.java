package com.csi.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> branchSet = new HashSet<String>();

		branchSet.add("IT");
		branchSet.add("COMPUTER");
		branchSet.add("E&TC");
		branchSet.add("CIVIL");
		branchSet.add("IT");
		branchSet.add(null);
		branchSet.add("MECHANICAL");
		branchSet.add("ELECTRICAL");
		branchSet.add("PETROLIUM");
		branchSet.add(null);
		branchSet.add("CHEMICAL");

		// System.out.println(branchSet);

		/*
		 * Iterator<String> iterator = branchSet.iterator();
		 * 
		 * while (iterator.hasNext()) { System.out.println(iterator.next()); }
		 */
		
		/*
		 * for(String branch: branchSet) { System.out.println(branch); }
		 */
		
		//branchSet.forEach(b-> System.out.println(b));
		
		branchSet.forEach(System.out::println);
	}
}
