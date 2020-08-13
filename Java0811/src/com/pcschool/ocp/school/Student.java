package com.pcschool.ocp.school;

public class Student extends BMI implements Comparable<Student>{
	private String name;
	private int age;
	
	public Student(String name, int age, int height, double weight) {
		super(height, weight);
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student o) {
		return age - o.age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + super.toString() + "]";
	}
}
