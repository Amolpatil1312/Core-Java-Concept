package com.csi.oops.constructorcore;

class Department {
	int deptId = 101;
	String deptName = "HR";
	String deptCode = "AA99";

	public Department() {
		// TODO Auto-generated constructor stub

		System.out.println(
				"\n Department Id: " + deptId + "\n Department Name: " + deptName + "\n Department Code: " + deptCode);
	}

	public Department(String hod) {
		System.out.println("\n Department HOD: " + hod);
	}

}

public class ConstructorCoreConcept {
	public static void main(String[] args) {

		Department department = new Department();

		Department department2 = new Department("Mr. DAN");
	}

}
