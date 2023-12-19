package com.fullstack.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimeAPIExample {

	public static void main(String[] args) {
		
		System.out.println("\n JDK 7 Date: "+ new Date());
		System.out.println("\n JDK 8 Date: "+ LocalDate.now().getYear());
		System.out.println("\n JDK 8 DateTime: "+ LocalDateTime.now());

	}

}
