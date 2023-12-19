package com.csi.stringcore;

import java.util.Arrays;

public class RepeatedCharacterWithOccurencesEx {

	public static void main(String[] args) {
		String name = "azzzcgghkkk";

		char str[] = name.toLowerCase().toCharArray();

		Arrays.sort(str);

		for (int i = 0; i < str.length; i++) {

			char temp = str[i];
			int count = 1;

			for (int j = i + 1; j < str.length; j++) {

				if (str[i] == str[j]) {
					count++;
					i++;
				}
			}

			if (count > 1) {
				System.out.println("" + temp + ": " + count);
			}
		}

	}

}
