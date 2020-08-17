package com.pcschool.ocp.finish.d04;

public class Car {
	private static String brand = "Toyota";
	private String typeName;
	
	public void printCar() {
		System.out.println(brand + ": " + typeName);
	}
	
	public static void printCar2() {
		System.out.println(brand);
		System.out.println(new Car().typeName);
	}
}
