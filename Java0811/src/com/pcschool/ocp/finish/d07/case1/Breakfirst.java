package com.pcschool.ocp.finish.d07.case1;

import com.pcschool.ocp.finish.d07.case1.food.Hamburger;
import com.pcschool.ocp.finish.d07.case1.food.Sandwich;
import com.pcschool.ocp.finish.d07.case1.material.Hotdog;
import com.pcschool.ocp.finish.d07.case1.material.Material;

public class Breakfirst {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich("火腿蛋三明治");
		Hotdog hotdog = new Hotdog();
		sandwich.addMaterial(hotdog);
		System.out.println(sandwich.getName());
		System.out.println(sandwich.getPrice());

		Hamburger hamburger = new Hamburger("牛肉蛋堡");
		System.out.println(hamburger.getName());
		System.out.println(hamburger.getPrice());
		
		System.out.println(sandwich.getName() + ":");
		sandwich.getMaterials().stream().forEach(material -> System.out.println("\t" + material.getName() + ": " + material.getPrice() + " 元"));
	
		System.out.println(hamburger.getName() + ":");
		hamburger.getMaterials().stream().forEach(material -> System.out.println("\t" + material.getName() + ": " + material.getPrice() + " 元"));
	}
}
