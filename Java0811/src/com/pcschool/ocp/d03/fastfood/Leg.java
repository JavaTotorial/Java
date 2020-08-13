package com.pcschool.ocp.d03.fastfood;

public class Leg {
    private int price = 45;
    private static int amount = 10;
    
    public int getPrice() {
        return price;
    }
    public Leg() {
    	amount--;
    }
	public static int getAmount() {
		return amount;
	}
}
