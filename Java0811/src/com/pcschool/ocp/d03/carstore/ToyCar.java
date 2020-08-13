package com.pcschool.ocp.d03.carstore;

public class ToyCar {
	int price;
	Wheel wheel;
	Tire[] tires;
	Engine engine;
	
	public int getPrice() {
		int tiresTotalPrice = 0;
		for(Tire tire : tires)
			tiresTotalPrice += tire.price;
		return tiresTotalPrice + wheel.price + engine.price;
	}
}
