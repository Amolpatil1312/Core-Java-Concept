package com.csi.core;

import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class HRMEx {

	public static void main(String[] args) {

		Stream.of(new Employee(121, "SWARA", 65000.00), new Employee(122, "RAM", 15000.00),
				new Employee(127, "LAKSHMI", 95000.00)).filter(emp -> emp.getEmpSalary() >= 50000.00)
				.forEach(System.out::println);

	}

}
