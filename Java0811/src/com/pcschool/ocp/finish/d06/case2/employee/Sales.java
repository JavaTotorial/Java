package com.pcschool.ocp.finish.d06.case2.employee;

import com.pcschool.ocp.finish.d06.case2.salary.SalesSalary;

public class Sales extends Employee {
 
	public Sales() {
		SalesSalary salesSalary = new SalesSalary();
		setSalary(salesSalary);
	}
	 
}
 
