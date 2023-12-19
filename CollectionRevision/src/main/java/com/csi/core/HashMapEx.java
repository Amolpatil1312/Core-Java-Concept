package com.csi.core;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {

		Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

		Employee employee1 = new Employee(121, "SWARA", 45000, 16);
		Employee employee2 = new Employee(129, "SNEHAL", 25000, 22);
		Employee employee3 = new Employee(122, "RAM", 55000, 17);

		Employee employee4 = new Employee(123, "LAKSHMI", 95000, 19);
		Employee employee5 = new Employee(125, "VENKAT", 15000, 45);

		employeeMap.put(employee1.getEmpId(), employee1);
		employeeMap.put(employee2.getEmpId(), employee2);
		employeeMap.put(employee3.getEmpId(), employee3);
		employeeMap.put(employee4.getEmpId(), employee4);
		employeeMap.put(employee5.getEmpId(), employee5);

		/*
		 * for (Map.Entry<Integer, Employee> m : employeeMap.entrySet()) {
		 * if(m.getValue().getEmpSalary()>=50000.00) { System.out.println(m.getKey() +
		 * ": " + m.getValue()); } }
		 */

		/*
		 * employeeMap.forEach((k, v) -> { if(v.getEmpSalary()<=50000.00) {
		 * System.out.println(k + ": " + v); } });
		 */

		employeeMap.entrySet().stream().forEach(emp -> System.out.println(emp.getKey() + ": " + emp.getValue()));
	}

}
