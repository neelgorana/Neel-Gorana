package com.yourname.assignment.utilities;
import com.yourname.assignment.employees.Employee;


public class EmployeeUtilities {
	
	public void display(Employee employee) {
		
		System.out.println("Name :" + employee.getEname());
		System.out.println("Employee ID : " + employee.getEmpid());
		System.out.println("Salary :" + employee.getSalary());
	}

}
