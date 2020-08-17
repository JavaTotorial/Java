package com.pcschool.ocp.d01_.d03.foodshop;

public class Leg {
	private int price = 45;
	private static int amount = 10;
	
	public Leg() {
		amount--;
	}
	
	public int getPrice() {
		return price;
	}
	public static int getAmount() {
		return amount;
	}
}
