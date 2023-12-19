package com.fullstack.jdk8features;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
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

public class StreamAPIEx {

	public static void main(String[] args) {

		// sort by name
		/*
		 * Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI",
		 * 95000), new Employee(123, "RAM", 35000), new Employee(127, "VENKAT",
		 * 50.00000), new Employee(129, "SWARA",
		 * 15000)).sorted(Comparator.comparing(Employee::getEmpName)) .forEach(emp ->
		 * System.out.println(emp.getEmpName()));
		 */
		// sort by salary
		/*
		 * Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI",
		 * 95000), new Employee(123, "RAM", 35000), new Employee(127, "VENKAT",
		 * 50000.00), new Employee(129, "SWARA",
		 * 15000)).sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
		 * .forEach(emp -> System.out.println(emp));
		 */

		// 2nd largest salary record

		/*
		 * Employee employee = Stream .of(new Employee(121, "SWARA", 65000), new
		 * Employee(122, "LAKSHMI", 95000), new Employee(123, "RAM", 35000), new
		 * Employee(127, "VENKAT", 50000.00), new Employee(129, "SWARA", 15000))
		 * .sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).
		 * collect(Collectors.toList()) .get(1);
		 * 
		 * System.out.println(employee);
		 */

		// filter data by salary
		/*
		 * Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI",
		 * 95000), new Employee(123, "RAM", 35000), new Employee(127, "VENKAT",
		 * 50000.00), new Employee(129, "SWARA", 15000)).filter(emp->
		 * emp.getEmpSalary()>=50000.00).forEach(System.out::println);
		 */
		// filter data by name
		/*
		 * Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI",
		 * 95000), new Employee(123, "RAM", 35000), new Employee(127, "VENKAT",
		 * 50000.00), new Employee(129, "SWARA", 15000)).filter(emp->
		 * emp.getEmpName().equalsIgnoreCase("sWARA")).forEach(System.out::println);
		 */

		// HashMap Filter Data BySalary

		List<Employee> employees = Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI", 95000),
				new Employee(999, "RAM", 35000), new Employee(127, "VENKAT", 50000.00),
				new Employee(129, "SWARA", 15000)).collect(Collectors.toList());

		Map<Integer, Employee> employeeMap = new LinkedHashMap<Integer, Employee>();

		for (Employee employee : employees) {
			employeeMap.put(employee.getEmpId(), employee);
		}

		/*
		 * employeeMap.forEach((k, v) -> { if (v.getEmpSalary() >= 50000.00) {
		 * System.out.println(k + ": " + v); } });
		 */

		// employeeMap.entrySet().stream().forEach(e-> System.out.println(e.getKey()+":
		// "+e.getValue()));

		double avg = Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI", 95000),
				new Employee(999, "RAM", 35000), new Employee(127, "VENKAT", 50000.00),
				new Employee(129, "SWARA", 15000)).collect(Collectors.averagingDouble(Employee::getEmpSalary));

		System.out.println(avg);
	}

}
