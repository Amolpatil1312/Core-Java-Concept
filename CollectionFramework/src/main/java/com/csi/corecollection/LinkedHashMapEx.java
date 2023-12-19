package com.csi.corecollection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {

		Map<String, String> hashMap = new LinkedHashMap<String, String>();

		hashMap.put("ID", "121");
		hashMap.put("NAME", "SWARA");
		hashMap.put(null, "USA");
		hashMap.put("SALARY", "65000.22");
		hashMap.put("ADDRESS", "PUNE");
		hashMap.put(null, "JAPAN");

		hashMap.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

	}

}
