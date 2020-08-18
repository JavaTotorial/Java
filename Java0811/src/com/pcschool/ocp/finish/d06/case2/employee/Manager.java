package com.pcschool.ocp.finish.d06.case2.employee;

import com.pcschool.ocp.finish.d06.case2.salary.ManagerSalary;

public class Manager extends Employee {

	public Manager() {
		ManagerSalary managerSalary = new ManagerSalary();
		setSalary(managerSalary);
	}
	 
}
 
