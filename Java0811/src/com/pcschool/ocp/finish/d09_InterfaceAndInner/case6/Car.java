package com.pcschool.ocp.finish.d09_InterfaceAndInner.case6;

public class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
}
