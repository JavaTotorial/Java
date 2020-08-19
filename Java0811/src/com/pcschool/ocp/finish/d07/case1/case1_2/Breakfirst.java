package com.pcschool.ocp.finish.d07.case1.case1_2;

import java.util.Arrays;

import com.pcschool.ocp.finish.d07.case1.case1_2.food.*;
import com.pcschool.ocp.finish.d07.case1.case1_2.material.*;

public class Breakfirst {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich("火腿蛋三明治");
		sandwich.addMaterial(new Hotdog());
		System.out.println(sandwich.getName()); // 火腿蛋三明治
		System.out.println(sandwich.getPrice()); // 25

		Hamburger hamburger = new Hamburger("牛肉蛋堡");
		System.out.println(hamburger.getName()); // 牛肉蛋堡
		System.out.println(hamburger.getPrice()); // 50

		System.out.println(sandwich.getName() + ":");
		Arrays.stream(sandwich.getMaterials())
				.forEach(m -> System.out.println("\t" + m.getName() + ": " + m.getPrice() + " 元"));

		System.out.println(hamburger.getName() + ": ");
		Arrays.stream(hamburger.getMaterials())
				.forEach(m -> System.out.println("\t" + m.getName() + ": " + m.getPrice() + " 元"));
	}
}
