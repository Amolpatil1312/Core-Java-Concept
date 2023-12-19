package com.csi.core;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharacter {

	public static void main(String[] args) {
		/*
		 * 
		 * String name = "Ahemednagar";
		 * 
		 * char str[] = name.toLowerCase().toCharArray();
		 * 
		 * Arrays.sort(str);
		 * 
		 * for (int i = 0; i < str.length; i++) { int count = 1;
		 * 
		 * char temp = str[i];
		 * 
		 * for (int j = i + 1; j < str.length; j++) { if (str[i] == str[j]) {
		 * 
		 * i++; count++; } }
		 * 
		 * if (count > 1) System.out.println(temp + ": " + count);
		 * 
		 * }
		 */

		String name = "Ahemednagar";

		Map<Character, Long> counterMap = name.toLowerCase().chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		/*
		 * counterMap.forEach((k, v) -> { if (v > 1) { System.out.println(k + ": " + v);
		 * } });
		 */
		
		counterMap.entrySet().stream().filter(s-> s.getValue()>1).forEach(System.out::println);
		
	}

}
