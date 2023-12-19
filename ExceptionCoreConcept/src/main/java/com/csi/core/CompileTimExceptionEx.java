package com.csi.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompileTimExceptionEx {

	public static void main(String[] args) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Date dobDate = dateFormat.parse("09-09-2020");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
