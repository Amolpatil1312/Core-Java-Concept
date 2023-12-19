package com.csi.oops.inheritanceconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Department {
	int deptCode = 555;
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

	void get(int deptId, String deptName, Date deptStartDate) {
		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName
				+ "\n Department Start Date: " + simpleDateFormat.format(deptStartDate));
	}
}

class Employee extends Department {
	int empCode;
	String empAddress;

	int deptCode = 111;

	void set(int empId, String empName, double empSalary, Date empDOB) {
		System.out.println("\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: "
				+ empSalary + "\n Employee DOB: " + simpleDateFormat.format(empDOB));
	}

	void display(int empCode, String empAddress) {

		this.empCode=empCode;
		this.empAddress=empAddress;
	}

	void show() {
		System.out.println("\n Department Code: " + super.deptCode);
		System.out.println("\n Employee Code: " + empCode + "\n Employee Address: " + empAddress);
	}
}

public class SingleInheritance {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Department department = new Employee();

		department.get(101, "HR", simpleDateFormat.parse("09-09-2020"));

		((Employee) department).set(121, "SWARA", 96000, simpleDateFormat.parse("11-11-1996"));

		((Employee) department).display(100, "INDIA");
		((Employee) department).show();
	}

}
