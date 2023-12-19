package com.csi.core;

public class TypeCastConcept {

	public static void main(String[] args) {

		/*
		 * String number ="11";
		 * 
		 * int id= Integer.parseInt(number);
		 * 
		 * System.out.println(id);
		 */

		/*
		 * int empCode = 555;
		 * 
		 * String employeeCode = String.valueOf(empCode);
		 * 
		 * System.out.println(employeeCode);
		 */

		/*
		 * double empSalary = 56000.22;
		 * 
		 * String employeeSalary = String.valueOf(empSalary);
		 * 
		 * System.out.println(employeeSalary);
		 */

		/*
		 * float productPrice = 67000.34f;
		 * 
		 * double prodPrice=productPrice;
		 * 
		 * System.out.println(prodPrice);
		 */

		double productPrice = 67000.34;

		float prodPrice = (float) productPrice;

		System.out.println(prodPrice);

	}

}
