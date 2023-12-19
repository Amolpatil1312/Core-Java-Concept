package com.fullstack.jdk8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateWordfromString {

	public static void main(String[] args) {
		String name = "Java Python Java React java";

		Map<String, Long> counterMap = Arrays.asList(name.split(" ")).stream()
				.collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

		// System.out.println(counterMap);

		/*
		 * counterMap.forEach((k, v) -> { if (v > 1) { System.out.println(k + ": " + v);
		 * } });
		 */

		counterMap.entrySet().stream().filter(lang -> lang.getValue() > 1)
				.forEach(lang -> System.out.println(lang.getKey() + ": " + lang.getValue()));
	}

}
