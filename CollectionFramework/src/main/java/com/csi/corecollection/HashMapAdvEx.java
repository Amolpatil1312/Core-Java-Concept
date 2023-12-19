package com.csi.corecollection;

import java.util.HashMap;
import java.util.Map;

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

public class HashMapAdvEx {

	public static void main(String[] args) {

		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

		Employee employee1 = new Employee(121, "SWARA", 65000);
		Employee employee2 = new Employee(122, "RAM", 95000);
		Employee employee3 = new Employee(127, "VENKAT", 15000);
		Employee employee4 = new Employee(129, "SNEHAL", 55000);
		Employee employee5 = new Employee(131, "POOJA", 50000);

		employeeMap.put(employee1.getEmpId(), employee1);
		employeeMap.put(employee2.getEmpId(), employee2);
		employeeMap.put(employee3.getEmpId(), employee3);
		employeeMap.put(employee4.getEmpId(), employee4);
		employeeMap.put(employee5.getEmpId(), employee5);

		/*
		 * for (Map.Entry<Integer, Employee> m : employeeMap.entrySet()) { if
		 * (m.getValue().getEmpSalary() <= 50000.00) { System.out.println(m.getKey() +
		 * ": " + m.getValue()); } }
		 */

		/*
		 * employeeMap.forEach((k, v) -> { if (v.getEmpSalary() >= 50000.00) {
		 * System.out.println(k + ": " + v); } });
		 */

	//	employeeMap.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

		
		employeeMap.entrySet().stream().filter(e-> e.getValue().getEmpSalary()>=50000.00).forEach(System.out::println);
	}

}
