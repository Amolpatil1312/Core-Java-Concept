package com.csi.oops.polymorphismconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Company {

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

	void get(int cId, String cName, Date cStartDate) throws ParseException {

		System.out.println("\n Company Id: " + cId + "\n Company Name: " + cName + "\n Company Start Date: "
				+ simpleDateFormat.format(cStartDate));
	}

	void get(String cAddress) {
		System.out.println("\n Company Address: " + cAddress);
	}

}

class Product extends Company {

	@Override
	void get(int cId, String cName, Date cStartDate) throws ParseException {
		// TODO Auto-generated method stub
		super.get(101, "INFOSYS", simpleDateFormat.parse("11-11-1996"));

		System.out.println("\n Company Id: " + cId + "\n Company Name: " + cName + "\n Company Start Date: "
				+ simpleDateFormat.format(cStartDate));
	}

}

public class MethodOverloadAndOverrideConcept {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Company company = new Product();

		company.get(111, "FINTECH CSI", simpleDateFormat.parse("09-09-2020"));

		company.get("PUNE");

	}

}
