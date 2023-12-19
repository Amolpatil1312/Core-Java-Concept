package com.fullstack.jdk8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedWords {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java", "React", "java", "Python");

		Map<String, Long> counterMap = list.stream()
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
