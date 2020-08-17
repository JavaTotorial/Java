package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.*;

public class DrinkStore {
	public static void main(String[] args) {
		PearlTea pearlTea = new PearlTea();
		System.out.println(pearlTea.getPrice());
		
		GreenPearlMilk greenPearlMilk = new GreenPearlMilk();
		System.out.println(greenPearlMilk.getPrice());
	}
}
