package com.pcschool.ocp.finish.d03.carstore;

public class ToyStore {
	public static void main(String[] args) {
		ToyCar toyCar = new ToyCar();
		
		toyCar.engine = new Engine();
		toyCar.wheel = new Wheel();
		toyCar.tires = new Tire[] {new Tire(), new Tire(), new Tire(), new Tire()};
		
		System.out.println(toyCar.getPrice());
	}
}
