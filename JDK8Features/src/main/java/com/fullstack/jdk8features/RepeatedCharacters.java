package com.fullstack.jdk8features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacters {

	public static void main(String[] args) {
		String name = "fullstack";

		Map<Character, Long> counterMap = name.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// System.out.println(counterMap);

		/*
		 * counterMap.forEach((k, v) -> { if (v > 1) { System.out.println(k + ": " + v);
		 * } });
		 */
		
		counterMap.entrySet().stream().filter(c-> c.getValue()>1).forEach(x-> System.out.println(x.getKey()+": "+x.getValue()));

	}

}
