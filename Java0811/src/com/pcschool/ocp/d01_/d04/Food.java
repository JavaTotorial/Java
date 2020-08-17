package com.pcschool.ocp.d01_.d04;

import java.util.Random;

public class Food {
	public static String name;
	private int amount = 100;
	private int price;

	static{
		int n = new Random().nextInt(10);
		name = n % 2 == 0 ? "可樂" : "糖水";
	}
	{
		int n = new Random().nextInt(10);
		price = n % 2 == 0 ? 100 : 50;
	}

	public Food() {
	}

	public Food(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Food [amount=" + amount + ", price=" + price + "]";
	}
}
