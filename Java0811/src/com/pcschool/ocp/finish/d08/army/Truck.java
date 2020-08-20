package com.pcschool.ocp.finish.d08.army;

public class Truck extends Car {
	
	public Truck() {
		System.out.println("Truck...");
	}
	
	@Override
	void move() {
		System.out.println("Truck 是用輪子走的...");
	}
	
}
