package com.csi.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ListConcept {

	public static void main(String[] args) {

		Stream.of(new Employee(121, "SWARA", 65000), new Employee(122, "LAKSHMI", 96000),
				new Employee(129, "SNEHAL", 45000)).sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed()).forEach(System.out::println);

		// List<Employee> employeeList = new ArrayList<Employee>();

		/*
		 * employeeList.add(new Employee(121, "SWARA", 65000)); employeeList.add(new
		 * Employee(122, "RAM", 35000)); employeeList.add(new Employee(129, "SNEHAL",
		 * 50000.00)); employeeList.add(new Employee(131, "PUJA", 25000));
		 * employeeList.add(new Employee(151, "VENKAT", 95000));
		 * 
		 * 
		 * for (Employee employee : employeeList) { if (employee.getEmpSalary() >=
		 * 50000.00) { System.out.println(employee); } }
		 * 
		 * 
		 * //employeeList.stream().filter(emp -> emp.getEmpSalary() >=
		 * 50000.00).forEach(System.out::println);
		 * 
		 * employeeList.stream().filter(emp-> emp.getEmpSalary()>=50000.00).forEach(e->
		 * System.out.println(e));
		 */

	}

}
