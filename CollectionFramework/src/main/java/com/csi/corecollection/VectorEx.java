package com.csi.corecollection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.add("IT");
		vector.add("COMPUTER");
		vector.add(null);
		vector.add("CIVIL");

		vector.forEach(System.out::println);
	}

}
