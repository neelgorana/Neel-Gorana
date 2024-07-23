package com.yourname.assignment.employees;

public class Developer extends Employee{
	
	

	

	

	public Developer(String ename, int empid, double salary, String language) {
		super(ename, empid, salary);
		this.language = language;
	}

	private String language;
	
	

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}
	
	
	
	
	

}
