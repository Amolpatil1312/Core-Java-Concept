package com.csi.corecollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("IT");
		linkedHashSet.add("COMPUTER");
		linkedHashSet.add(null);
		linkedHashSet.add("CIVIL");

		linkedHashSet.forEach(System.out::println);
	}

}
