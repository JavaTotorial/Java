package com.pcschool.ocp.d06.case2.employee;

import com.pcschool.ocp.d06.case2.salary.Salary;

public class Employee {
 
	private Salary salary;
	 
	public Employee() {
		Salary salary = new Salary();
		setSalary(salary);
	}
	
	public Salary getSalary() {
		return salary;
	}
	 
	public void setSalary(Salary salary) {
		this.salary = salary;
	}
}
