package com.csi.corecollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("ID", "121");
		hashMap.put("NAME", "SWARA");
		hashMap.put(null, "USA");
		hashMap.put("SALARY", "65000.22");
		hashMap.put("ADDRESS", "PUNE");
		hashMap.put(null, "JAPAN");

		/*
		 * for (Map.Entry<String, String> m : hashMap.entrySet()) {
		 * System.out.println(m.getKey() + ": " + m.getValue()); }
		 */

		// hashMap.forEach((k, v) -> System.out.println(k + ": " + v));

		hashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}

}
