package com.csi.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	private int empAge;

	public Employee(int empId, String empName, double empSalary, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAge = empAge;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAge=" + empAge
				+ "]";
	}

}

public class HRMApplication {

	public static void main(String[] args) {

		Stream.of(new Employee(121, "SWARA", 65000, 22), new Employee(122, "RAM", 55000, 16),
				new Employee(123, "LAKSHMI", 95000, 19), new Employee(125, "VENKAT", 15000, 45),
				new Employee(129, "TANAY", 50000, 21)).filter(emp -> emp.getEmpSalary() <= 50000)
				.forEach(System.out::println);

		/*
		 * List<Employee> employeeList = new ArrayList<Employee>();
		 * 
		 * 
		 * employeeList.add(new Employee(121, "SWARA", 65000, 22)); employeeList.add(new
		 * Employee(122, "RAM", 55000, 16)); employeeList.add(new Employee(123,
		 * "LAKSHMI", 95000, 19)); employeeList.add(new Employee(125, "VENKAT", 15000,
		 * 45)); employeeList.add(new Employee(129, "TANAY", 50000, 21));
		 */

		/*
		 * employeeList.stream().sorted(Comparator.comparingDouble(Employee::
		 * getEmpSalary)) .forEach(emp -> System.out.println(emp.getEmpSalary()));
		 */

		/*
		 * for (Employee employee : employeeList) { if (employee.getEmpSalary() >=
		 * 50000.00) { System.out.println(employee); } }
		 */

		// employeeList.stream().filter(emp -> emp.getEmpSalary() <=
		// 50000.00).forEach(System.out::println);

		// employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed()).forEach(System.out::println);
	}

}
