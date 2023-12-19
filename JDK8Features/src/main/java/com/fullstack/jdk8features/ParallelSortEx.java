package com.fullstack.jdk8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ParallelSortEx {

	public static void main(String[] args) {
		int arr[] = { 9, 2, 8, 5, 3 };

		System.out.println("\n Before sort: ");

		for (int i : arr) {
			System.out.println(i);
		}
		
		System.out.println("\n After sort: ");

		Arrays.parallelSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		
		List<Integer> list = Arrays.asList( 9, 2, 8, 5, 3 );
		
		System.out.println("Rev Order");
		list.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(System.out::println);
	}

}
