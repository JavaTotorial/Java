package com.pcschool.ocp.finish.d06.case2.employee;

import com.pcschool.ocp.finish.d06.case2.salary.OperatorSalary;

public class Operator extends Employee {
	
	public Operator() {
		OperatorSalary operatorSalary = new OperatorSalary();
		setSalary(operatorSalary);
	}
}
