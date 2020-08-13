package com.pcschool.ocp.d03.fastfood;

public class Breast {
    private int price = 35;
    private static int amount = 10;
    
    public int getPrice() {
        return price;
    }
    public Breast() {
    	amount--;
    }
	public static int getAmount() {
		return amount;
	}
    
}
