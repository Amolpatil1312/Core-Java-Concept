package com.csi.core;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int arr[] = {1001, 4, 8, 3, 2, 9 };

		Arrays.parallelSort(arr);
		for(int i: arr)
		{
			System.out.print(i);}
		}

}
