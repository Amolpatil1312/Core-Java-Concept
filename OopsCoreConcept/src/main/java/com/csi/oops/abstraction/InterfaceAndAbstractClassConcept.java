package com.csi.oops.abstraction;

interface Department {

	void get(int deptId, String deptName);

	static void set() {

		System.out.println("I am from static method");
	}

	default void show() {

		System.out.println("I am from default method");
	}

}

interface Employee {

	void display(int empId, String empName, double empSalary);

}

abstract class Product {

	abstract void showProductInfo(int productId, String productName, double productPrice);

	void displayProductData(int productCode) {
		System.out.println("\n Product Code: " + productCode);
		//
	}
}

class Company extends Product implements Department, Employee {

	@Override
	void showProductInfo(int productId, String productName, double productPrice) {
		// TODO Auto-generated method stub
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productPrice);
	}

	@Override
	public void display(int empId, String empName, double empSalary) {
		// TODO Auto-generated method stub
		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}

	@Override
	public void get(int deptId, String deptName) {
		// TODO Auto-generated method stub

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	void showCompanyInfo(int cIN, String cName, String cAddress) {
		System.out.println("\n Company CIN: " + cIN + "\n Company Name: " + cName + "\n Company Address: " + cAddress);
	}

}

public class InterfaceAndAbstractClassConcept {

	public static void main(String[] args) {

		Company company = new Company();

		company.get(101, "HR");
		Department.set();
		company.show();
		company.display(121, "SWARA", 65000);
		company.showProductInfo(111, "APPLE PHONE", 96000);
		company.displayProductData(1001);
		company.showCompanyInfo(12345, "FINTECH CSI", "PUNE");

	}

}
