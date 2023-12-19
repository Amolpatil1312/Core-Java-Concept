package com.csi.core;

import java.util.Arrays;

public class ForEachEx {

	public static void main(String[] args) {
		int arr[] = { 6, 8, 9, 2, 3, 4, 11 };

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
