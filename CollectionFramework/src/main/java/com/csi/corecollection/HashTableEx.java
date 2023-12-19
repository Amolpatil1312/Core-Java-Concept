package com.csi.corecollection;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String, String> hashMap = new Hashtable<String, String>();

		hashMap.put("ID", "121");
		hashMap.put("NAME", "SWARA");

		hashMap.put("SALARY", "65000.22");
		hashMap.put("ADDRESS", "PUNE");

		hashMap.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});
	}

}
