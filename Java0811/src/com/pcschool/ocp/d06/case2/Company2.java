package com.pcschool.ocp.d06.case2;

import java.util.Arrays;

import com.pcschool.ocp.d06.case2.employee.Account;
import com.pcschool.ocp.d06.case2.employee.Employee;
import com.pcschool.ocp.d06.case2.employee.Manager;
import com.pcschool.ocp.d06.case2.employee.Operator;
import com.pcschool.ocp.d06.case2.employee.Sales;
import com.pcschool.ocp.d06.case2.employee.Supervistor;

public class Company2 {
	public static void main(String[] args) {
		Employee[] employees = {
				new Supervistor(),
				new Manager(),
				new Manager(),
				new Operator(),
				new Operator(),
				new Operator(),
				new Operator(),
				new Operator(),
				new Account(),
				new Account(),
				new Sales(),
				new Sales(),
				new Sales(),
				new Sales()
		};
		
		// Java 7
		// 總薪資成本 = ?
		int sum_all = 0;
		for(Employee emp : employees)
			sum_all += emp.getSalary().getMoney();
		System.out.printf("總薪資成本: %d\n", sum_all);
		
		// Sales 總薪資成本 = ? 
		int sum_sales = 0;
		for(Employee emp : employees)
			if(emp instanceof Sales)
				sum_sales += emp.getSalary().getMoney();
		System.out.printf("Sales總薪資成本: %d\n", sum_sales);
	
	
		// Java8
//		Arrays.stream(employees)
//				.forEach(e -> System.out.println(e.getSalary().getMoney()));
		
		// 總薪資成本 = ?
		int sum_all_java8 = Arrays.stream(employees)
							.mapToInt(emp -> emp.getSalary().getMoney())
							.sum();
		System.out.printf("總薪資成本: %d\n", sum_all_java8);
		
		// Sales 總薪資成本 = ? 
		int sum_sales_java8 = Arrays.stream(employees)
									.filter(employee -> employee instanceof Sales)
									.mapToInt(emp -> emp.getSalary().getMoney())
									.sum();
		System.out.printf("Sales總薪資成本: %d\n", sum_sales_java8);
	}
}
