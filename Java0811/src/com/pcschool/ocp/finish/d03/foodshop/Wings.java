package com.pcschool.ocp.finish.d03.foodshop;

public class Wings {
	private int price = 30;
	private static int amount = 10;
	
	public Wings() {
		amount--;
	}
	
	public int getPrice() {
		return price;
	}
	public static int getAmount() {
		return amount;
	}
}
