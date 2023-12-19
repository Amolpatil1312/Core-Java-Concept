package com.fullstack.jdk8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIConcept {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5005, 4001, 5, 5001, 6, 9, 2, 3, 5);

		// sum
		/*
		 * long sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		 * System.out.println(sum);
		 */

		// avg
		/*
		 * double avg =
		 * list.stream().collect(Collectors.averagingDouble(Integer::intValue));
		 * System.out.println(avg);
		 */

		long secondLargestNumber = list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed())
				.collect(Collectors.toList()).get(1);

		System.out.println(secondLargestNumber);
	}

}
