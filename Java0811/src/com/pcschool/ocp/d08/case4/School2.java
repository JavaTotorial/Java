package com.pcschool.ocp.d08.case4;

import java.util.Arrays;

public class School2 {
	public static void main(String[] args) {

		// @formatter:off
		Person[] p1 = { 
				new Teacher("T1", 30, 23.3, 70000), 
				new Teacher("T2", 35, 25.4, 90000),
				new Student("S1", 16, 17.5), 
				new Student("S2", 17, 22.5), 
				new Student("S3", 18, 24.5)
		};

		Person[] p2 = { 
				new Teacher("T3", 30, 23.3, 70000), 
				new Teacher("T4", 35, 25.4, 90000),
				new Teacher("T5", 32, 26.4, 80000), 
				new Student("S6", 19, 21.5), 
				new Student("S7", 20, 18.5) 
		};
		

		Person[][] people = { p1, p2 };

		// 求 Teacher 得平均薪資
		double avgSalary = Arrays.stream(people)
									.flatMap(Arrays::stream)
									.filter(person -> person instanceof Teacher)
									.map(per -> (Teacher) per)
									.map(Teacher::getSalary)
									.mapToInt(Salary::getMoney)
									.average()
									.getAsDouble();
		System.out.printf("Teacher 的平均薪資: %.2f", avgSalary);
		// @formatter:on
	}
}
