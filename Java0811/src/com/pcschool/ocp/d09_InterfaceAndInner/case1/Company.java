package com.pcschool.ocp.d09_InterfaceAndInner.case1;

public class Company {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee.Job job = emp.new Job();
		
		job.program();
		job.meating();
	}
}
