package com.pcschool.ocp.finish.d08.case4;

public abstract class Person {

	private String name;
	private int age;
	private double bmi;

	

	public Person(String name, int age, double bmi) {
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
