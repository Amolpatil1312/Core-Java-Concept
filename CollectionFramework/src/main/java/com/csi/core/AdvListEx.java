package com.csi.core;

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

public class AdvListEx {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(121, "SWARA", 65000));
		empList.add(new Employee(122, "RAM", 95000));
		empList.add(new Employee(125, "SNEHAL", 45000));
		empList.add(new Employee(127, "VENKAT", 50000));
		empList.add(new Employee(129, "LAXMAN", 15000));

		// System.out.println(empList);

		/*
		 * Iterator<Employee> iterator = empList.iterator(); while (iterator.hasNext())
		 * {
		 * 
		 * System.out.println(iterator.next()); }
		 */

		/*
		 * for (Employee employee : empList) { if (employee.getEmpSalary() >= 50000.00)
		 * { System.out.println(employee); } }
		 */

		// empList.forEach(emp-> System.out.println(emp));

		// empList.forEach(System.out::println);

		empList.stream().filter(emp -> emp.getEmpSalary() >= 50000.00).forEach(e -> System.out.println(e));
	}

}
