package com.pcschool.ocp.d06.case3;

import com.pcschool.ocp.d06.case3.drink.*;

public class DrinkStore {
	public static void main(String[] args) {
		PearlTea pearlTea = new PearlTea();
		System.out.println(pearlTea.getPrice());
		
		GreenPearlTea greenPearlMilk = new GreenPearlTea();
		System.out.println(greenPearlMilk.getPrice());
	}
}
