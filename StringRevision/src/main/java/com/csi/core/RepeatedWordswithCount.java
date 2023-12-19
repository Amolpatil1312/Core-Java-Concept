package com.csi.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWordswithCount {

	public static void main(String[] args) {

		// String words = "Java React Java Python React";

		String arr[] = { "Java", "React", "Java" };
		List<String> list = Arrays.asList(arr);

		Map<String, Long> counterMap = list.stream()
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		counterMap.forEach((k, v) -> {
			if (v > 1) {
				System.out.println(k + ": " + v);
			}
		});
	}

}
