package com.pcschool.ocp.finish.d03.fastfood;

public class FoodStore {
	public static void main(String[] args) {
		Combine a = new Combine(4, 2, 3, 4);
		Combine b = new Combine(7, 3, 5, 6);
		Combine c = new Combine(1, 1, 1, 1);
		Combine d = new Combine(9, 0, 0, 1);
		
		Combine[] combines = {a, b, c, d};
		
		for(Combine combine : combines)
			System.out.println(combine.getPrice());
		
		System.out.printf("庫存: 雞腿: %d 雞胸: %d 雞翅: %d 可樂: %d", 
				Leg.getAmount(), Breast.getAmount(), Wings.getAmount(), Coca.getAmount());
		
	}
}
