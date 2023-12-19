package com.csi.oops.inheritanceconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Company {

	int companyCode = 55;

	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

	void get(int cIN, String cName, String cAddress, Date cStartDate) {

		System.out.println("\n Company IDN: " + cIN + "\n Company Name: " + cName + "\n Company Address: " + cAddress
				+ "\n Company Start Date: " + simpleDateFormat.format(cStartDate));
	}

	void pop() {
		System.out.println("I am from Company");
	}
}

class Dept extends Company {
	void set(int deptId, String deptName, Date deptStartDate) {

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName
				+ "\n Department Start Date: " + simpleDateFormat.format(deptStartDate));
	}
}

class Emp extends Dept {

	void net(int empId, String empName, String empAddress, double empSalary, long empContactNumber, Date empDOB) {

		System.out.println("\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Address: "
				+ empAddress + "\n Employee Salary: " + empSalary + "\n Employee Contact Number: " + empContactNumber
				+ "\n Employee DOB: " + simpleDateFormat.format(empDOB));
	}
}

class Product extends Emp {

	int companyCode = 22;
	int productId;
	String productName;
	double productPrice;
	Date productLaunchDate;

	void showProductInfo(int productId, String productName, double productPrice, Date productLaunchDate) {

		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productLaunchDate = productLaunchDate;
	}

	void display() {
		System.out.println("\n Product Id: " + productId + "\n Product Name: " + productName + "\n Product Price: "
				+ productPrice + "\n Product Launch Date: " + simpleDateFormat.format(productLaunchDate));

		System.out.println("Company Code: " + super.companyCode);

		super.pop();
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Emp product = new Product();

		product.get(101, "FINTECH CSI", "PUNE", simpleDateFormat.parse("11-11-2017"));

		product.set(111, "HR", simpleDateFormat.parse("01-01-2020"));

		product.net(121, "SWARA", "PUNE", 45000, 9898989898L, simpleDateFormat.parse("09-09-2020"));

		((Product) product).showProductInfo(1001, "APPLE PHONE", 98000, simpleDateFormat.parse("11-11-2000"));
		((Product) product).display();

	}

}
