package com.csi.core;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapEx {

	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<String, String>();

		hashMap.put("ID", "121");
		hashMap.put("NAME", "SWARA");
		hashMap.put("SALARY", "96000");
		hashMap.put(null, "USA");
		hashMap.put("ADDRESS", "PUNE");
		hashMap.put(null, "JAPAN");

		/*
		 * for (Map.Entry<String, String> m : hashMap.entrySet()) {
		 * System.out.println(m.getKey() + ": " + m.getValue()); }
		 */

		/*
		 * hashMap.forEach((k, v)->{ System.out.println(k+": "+v); });
		 */

		hashMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

	}

}
