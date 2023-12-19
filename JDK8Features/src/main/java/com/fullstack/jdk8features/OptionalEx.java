package com.fullstack.jdk8features;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String name = "FULLSTACK";

		Optional<String> optional = Optional.ofNullable(name);

		if (optional.isPresent()) {
			System.out.println(name.length());
		} else {
			System.out.println("Name is null");
		}
	}

}
