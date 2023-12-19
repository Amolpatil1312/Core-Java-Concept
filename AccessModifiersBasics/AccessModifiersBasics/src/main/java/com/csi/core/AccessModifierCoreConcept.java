package com.csi.core;

class Employee {

	private int empId = 121;

	private String empName = "SWARA";

	double empSalary = 65000.92;

	void show() {
		System.out.println(empId + empName + empSalary);
	}
}

public class AccessModifierCoreConcept {

	protected long companyId = 111;

	protected String companyName = "FINTECH CSI";

	public String companyAddress = "FINTECH CSI | INSPIRIA MALL | PUNE | MH | INDIA";

	public static void main(String[] args) {

		Employee employee = new Employee();

		employee.show();

		System.out.println(employee.empSalary);

	}

	protected void display() {
		System.out.println("I am from AMCC");
	}

	public void showData() {
		System.out.println("FULL STACK");
	}

}
