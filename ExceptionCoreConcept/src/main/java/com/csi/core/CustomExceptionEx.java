package com.csi.core;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

public class CustomExceptionEx {

	public static void main(String[] args)throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\n Please enter Employee #ID: ");

		int employeeId = scanner.nextInt();

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(121, "SWARA", 65000));
		employeeList.add(new Employee(122, "RAM", 95000));
		employeeList.add(new Employee(123, "LAKSHMI", 75000));
		employeeList.add(new Employee(124, "VENKAT", 15000));
		employeeList.add(new Employee(129, "SHUBHAM", 55000));

		boolean flag = false;
		for (Employee employee : employeeList) {

			if (employee.getEmpId() == employeeId) {
				System.out.println(employee);
				flag = true;
				break;
			}
		}

		if (!flag) {
			throw new RecordNotFoundException("Employee ID Does not exist");
		}
	}

}
