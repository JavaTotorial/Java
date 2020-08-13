package com.pcschool.ocp.school;

public class Student extends BMI{
	private String name;
	private int age;
	private int serial;
	private static int no;
	
	public Student(String name, int age, int height, double weight) {
		super(height, weight);
		this.name = name;
		this.age = age;
		serial = ++no;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student" + serial + " [name=" + name + ", age=" + age + super.toString() + "]";
	}
}
