package com.csi.core;

import java.util.Arrays;

public class ForEachConcept {

	public static void main(String[] args) {
		int arr[] = { 7, 5, 4, 2, 1, 9 };

		Arrays.sort(arr);
		for (int i : arr) {

			System.out.println(i);
		}
	}

}
