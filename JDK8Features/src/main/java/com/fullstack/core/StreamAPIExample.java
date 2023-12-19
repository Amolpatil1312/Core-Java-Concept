package com.fullstack.core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIExample {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(121, "SWARA", 65000));
		employees.add(new Employee(122, "APARNA", 45000));
		employees.add(new Employee(123, "LAKSHMI", 95000));
		employees.add(new Employee(125, "PUJA", 75000));
		employees.add(new Employee(129, "VENKAT", 50000.00));

		// Sort By Name
		// employees.stream().sorted(Comparator.comparing(Employee::getEmpName)).forEach(em
		// -> System.out.println(em));

		// System.out.println("#######Sort By Salary######");
		// Sort By Salary
		// employees.stream().sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
		// .forEach(System.out::println);

		// System.out.println("#######Filter By Salary######");
		// employees.stream().filter(emp -> emp.getEmpSalary() <=
		// 50000.00).forEach(System.out::println);

		// long employeeCount = employees.stream().collect(Collectors.counting());

		// System.out.println("\n Number of Employees: " + employeeCount);

		// sort by age
		// sort by dob
		// filter by acc balance

		Map<Integer, Employee> hashMap = new HashMap<Integer, Employee>();

		for (Employee employee : employees) {
			hashMap.put(employee.getEmpId(), employee);

			
		}
		
		hashMap.forEach((k, v) -> {
			if (v.getEmpSalary() >= 50000.00) {
				System.out.println(k + ": " + v);
			}
		});
	}

}
