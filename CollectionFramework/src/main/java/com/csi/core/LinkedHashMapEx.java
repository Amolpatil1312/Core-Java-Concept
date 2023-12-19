package com.csi.core;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		Map<String, String> hashMap = new LinkedHashMap<String, String>();

		hashMap.put("ID", "121");
		hashMap.put("NAME", "SWARA");
		hashMap.put("SALARY", "96000");
		
		hashMap.put("ADDRESS", "PUNE");
		hashMap.put(null, "JAPAN");

		hashMap.entrySet().stream().forEach(e->System.out.println(e.getKey()+": "+e.getValue()));

	}

}
