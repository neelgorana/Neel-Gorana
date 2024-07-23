package com.yourname.assignment.employees;

public class Manager extends Employee{


	private String dept;
	
	public Manager(String ename, int empid, double salary, String dept) {
		super(ename, empid, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager [dept=" + dept + "]";
	}
	

}
