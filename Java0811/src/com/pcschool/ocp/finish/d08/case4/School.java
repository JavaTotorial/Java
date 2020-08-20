package com.pcschool.ocp.finish.d08.case4;

import java.util.Arrays;

public class School {
	public static void main(String[] args) {
		Person[] people = { new Teacher("T1", 30, 23.3, 700000), new Teacher("T2", 35, 25.4, 900000),
				new Student("S1", 16, 17.5), new Student("S2", 17, 22.5), new Student("S3", 18, 24.5), };

		// 平均年齡
		System.out.printf("School 平均年齡: %.2f\n",
				Arrays.stream(people).mapToInt(Person::getAge).average().getAsDouble());

		System.out.println("======================================");

		// Teacher 平均薪資
		System.out.printf("Teacher 平均薪資: %.2f\n", Arrays.stream(people).filter(person -> person instanceof Teacher)
				.mapToInt(p -> ((Teacher) p).getSalary().getMoney()).average().getAsDouble());

		System.out.println("======================================");

		// Student 平均 BMI
		System.out.printf("Student 平均 BMI: %.2f\n", Arrays.stream(people).filter(person -> person instanceof Student)
				.mapToDouble(Person::getBmi).average().getAsDouble());

		System.out.println("======================================");

		// 將名字中有"2"的人列出
		Arrays.stream(people).filter(person -> person.getName().contains("2")).forEach(System.out::println);

	}
}
