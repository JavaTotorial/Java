package com.pcschool.ocp.d03.fastfood;

public class Coca {
    private int price = 20;
    private static int amount = 10;
    
    public int getPrice() {
        return price;
    }
    public Coca() {
    	amount--;
    }
	public static int getAmount() {
		return amount;
	}
}
