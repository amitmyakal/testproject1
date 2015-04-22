package com.gtt;

public class Employee {

	int employeeId;
	String employeeName;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void addEmployee(){
		
		System.out.println("Hello Emp");
	}
public void updateEmployee(){
		System.out.println("Update Emp");
		System.out.println("Update Emp");
	}
}
