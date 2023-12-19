package com.csi.oops.constructorcore;

class Employee {

	int empId = 121;

	String empName = "SWARA";

	double empSalary = 65000;

	String empAddress;
	long empContactNumber;
	String empEmailId;

	public Employee() {
		// TODO Auto-generated constructor stub

		System.out.println(
				"\n Employee Id: " + empId + "\n Employee Name: " + empName + "\n Employee Salary: " + empSalary);
	}

	public Employee(String empAddress, long empContactNumber, String empEmailId) {

		this.empAddress = empAddress;
		this.empContactNumber = empContactNumber;
		this.empEmailId = empEmailId;
	}

	void show() {
		System.out.println("\n Employee Address: " + empAddress + "\n Employee Contact Number: " + empContactNumber
				+ "\n Employee EmailId: " + empEmailId);
	}

}

public class ConstructorBasics {

	public static void main(String[] args) {

		Employee employee = new Employee();

		Employee employee2 = new Employee("PUNE", 9898989898L, "SWARA@FINTECH.com");

		employee2.show();
	}

}
