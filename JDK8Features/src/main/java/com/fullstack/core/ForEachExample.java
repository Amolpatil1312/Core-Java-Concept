package com.fullstack.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

public class ForEachExample {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(121, "SWARA", 65000));
		employees.add(new Employee(122, "RAM", 45000));
		employees.add(new Employee(123, "LAKSHMI", 95000));
		employees.add(new Employee(125, "PUJA", 75000));
		employees.add(new Employee(129, "VENKAT", 15000));

		/*
		 * for (Employee employee : employees) {
		 * 
		 * System.out.println(employee);
		 * 
		 * }
		 */
		
		//employees.forEach(emp-> System.out.println(emp));
		
		employees.forEach(System.out::println);

	}

}
