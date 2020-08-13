package com.pcschool.ocp.d03.fastfood;

public class Wings {
    private int price = 30;
    private static int amount = 10;
    
    public int getPrice() {
        return price;
    }
    public Wings() {
    	amount--;
    }
	public static int getAmount() {
		return amount;
	}
}
