package com.csi.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {

	private int empId;

	private String empName;

	private int empAge;

	public Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
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

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		if (empAge == e1.empAge) {
			return 0;
		} else if (empAge > e1.empAge) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparableConcept {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(121, "SWARA", 22));
		empList.add(new Employee(122, "RAM", 45));
		empList.add(new Employee(123, "VENKAT", 16));
		empList.add(new Employee(125, "SNEHAL", 17));
		empList.add(new Employee(129, "POOJA", 23));

		Collections.sort(empList);
		
		/*
		 * for(Employee employee: empList) { System.out.println(employee); }
		 */
		
		empList.forEach(emp-> System.out.println(emp));

		//empList.forEach(System.out::println);

	}

}
