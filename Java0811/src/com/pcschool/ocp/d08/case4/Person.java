package com.pcschool.ocp.d08.case4;

public abstract class Person {

	private int age;
	private String name;
	private double bmi;

	

	public Person(int age, String name, double bmi) {
		this.age = age;
		this.name = name;
		this.bmi = bmi;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getBmi() {
		return bmi;
	}

	public abstract String toString();
}
