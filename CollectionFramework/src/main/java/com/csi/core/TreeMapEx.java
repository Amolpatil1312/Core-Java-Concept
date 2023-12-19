package com.csi.core;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		Map<String, String> treeMap = new TreeMap<String, String>();

		treeMap.put("ID", "121");
		treeMap.put("NAME", "SWARA");
		treeMap.put("SALARY", "96000");

		treeMap.put("ADDRESS", "PUNE");

		treeMap.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

	}

}
