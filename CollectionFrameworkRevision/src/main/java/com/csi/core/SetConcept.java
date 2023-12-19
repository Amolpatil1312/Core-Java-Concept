package com.csi.core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		Set hashSet = new HashSet<>();

		hashSet.add(1);
		hashSet.add("IT");
		hashSet.add(45.90);

		Iterator iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
