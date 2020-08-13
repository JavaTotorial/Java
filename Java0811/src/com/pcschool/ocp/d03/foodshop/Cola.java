package com.pcschool.ocp.d03.foodshop;

public class Cola {
	private int price = 20;
	private static int amount = 10;
	
	public Cola() {
		amount--;
	}
	
	public int getPrice() {
		return price;
	}
	public static int getAmount() {
		return amount;
	}
}
