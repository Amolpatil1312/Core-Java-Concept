package com.csi.core;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(4, 555, 9, 3, 2, 6);

		int n = integers.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed())
				.collect(Collectors.toList()).get(1);

		System.out.println(n);
	}

}
