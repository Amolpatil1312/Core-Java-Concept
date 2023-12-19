package com.csi.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("ID", "121");
		hashMap.put(null, "ABC");
		hashMap.put("NAME", "SWARA");
		hashMap.put("SALARY", "65000.22");
		hashMap.put(null, "XYZ");
		hashMap.put("ID", "999");
		hashMap.put("ADDRESS", "PUNE");

		/*
		 * for (Map.Entry<String, String> m : hashMap.entrySet()) {
		 * System.out.println(m.getKey() + ": " + m.getValue()); }
		 */

		/*
		 * hashMap.forEach((k, v) -> { System.out.println(k + ": " + v); });
		 */

		hashMap.entrySet().stream().forEach(emp -> System.out.println(emp));

	}

}
