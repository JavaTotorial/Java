package com.pcschool.ocp.d01_.d04;

public class ConstrustorDemo {
	public static void main(String[] args) {
		Employee emp = new Employee("Victor", 40000);
		System.out.println(emp);
		
		Employee emp2 = new Employee();
		System.out.println(emp2);
	}
}