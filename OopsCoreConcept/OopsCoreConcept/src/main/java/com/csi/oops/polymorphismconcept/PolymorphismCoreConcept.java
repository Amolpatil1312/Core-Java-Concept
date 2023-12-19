package com.csi.oops.polymorphismconcept;

class Department {
	void get(int deptId, String deptName) {

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);

	}

	void get(int deptCode) {
		System.out.println("\n Department Code: " + deptCode);
	}
}

class Employee extends Department {

	void get(int deptId, String deptName) {

		super.get(100, "FINANCE");

		System.out.println("\n Department Id: " + deptId + "\n Department Name: " + deptName);

	}

}

public class PolymorphismCoreConcept {

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.get(101, "HR");
		employee.get(999);
	}

}
