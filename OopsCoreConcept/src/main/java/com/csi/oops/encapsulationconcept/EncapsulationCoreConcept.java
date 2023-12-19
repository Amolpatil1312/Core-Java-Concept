package com.csi.oops.encapsulationconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Employee {
	private int empId;

	private String empName;

	private String empAddress;

	private long empContactNumber;

	private double empSalary;

	private Date empDOB;

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

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public long getEmpContactNumber() {
		return empContactNumber;
	}

	public void setEmpContactNumber(long empContactNumber) {
		this.empContactNumber = empContactNumber;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Date getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}

	@Override
	public String toString() {

		/*
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		 * 
		 * String dobDate = simpleDateFormat.format(empDOB);
		 */
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", empContactNumber=" + empContactNumber + ", empSalary=" + empSalary + ", empDOB=" + empDOB + "]";
	}

}

public class EncapsulationCoreConcept {

	public static void main(String[] args) {

		Employee employee = new Employee();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

		employee.setEmpId(121);
		employee.setEmpName("SWARA");
		employee.setEmpAddress("PUNE");
		employee.setEmpContactNumber(9898998989L);
		employee.setEmpSalary(65000.22);
		try {
			employee.setEmpDOB(simpleDateFormat.parse("22-11-2020"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\n Employee Id: " + employee.getEmpId() + "\n Employee Name: " + employee.getEmpName()
				+ "\n Employee Address: " + employee.getEmpAddress() + "\n Employee Contact Number: "
				+ employee.getEmpContactNumber() + "\n Employee Salary: " + employee.getEmpSalary()
				+ "\n Employee DOB: " + simpleDateFormat.format(employee.getEmpDOB()));
	}

}
