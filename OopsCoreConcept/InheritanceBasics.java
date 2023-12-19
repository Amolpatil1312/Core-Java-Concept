package com.csi.coreoops;

class Department {
	int deptCode = 555;

	void get(int deptId, String deptName) {
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);
	}

	void show() {
		System.out.println("I am from show");
	}
}

class Employee extends Department {

	int deptCode = 999;

	void show() {
		System.out.println("Employee Show");
	}

	void set(int empId, String empName, String empAddress) {
		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Address: " + empAddress);

	}

}

class Product extends Employee {

	void net(int productId, String productName, double productPrice) {
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productPrice + "\n Department Code: " + super.deptCode);

		super.show();
	}
}

class Company extends Product {
	//

}

public class InheritanceBasics {
	public static void main(String[] args) {

		Company product = new Company();

		product.get(101, "HR");
		product.set(121, "SWARA", "PUNE");
		product.net(111, "APPLE PHONE", 980000.22);
	}
}
