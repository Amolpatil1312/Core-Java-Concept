package com.csi.core;

import java.util.Arrays;
import java.util.List;

public class DistinctEx {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "React", "Java", "Python");

		words.stream().distinct().forEach(System.out::println);
	}

}
