package com.pcschool.ocp.finish.d09_InterfaceAndInner.case5;

public class CarStore {
	public static void main(String[] args) {
		Motor m1 = new Car();
		Motor m2 = () -> System.out.println("180");

		m1.speed();
		m2.speed();
	}
}
