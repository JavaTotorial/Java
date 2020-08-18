package com.pcschool.ocp.finish.d06.case3;

import com.pcschool.ocp.finish.d06.case3.drink.*;

public class DrinkStore {
	public static void main(String[] args) {
		PearlTea pearlTea = new PearlTea();
		System.out.println(pearlTea.getPrice());
		
		GreenPearlTea greenPearlMilk = new GreenPearlTea();
		System.out.println(greenPearlMilk.getPrice());
		
		System.out.print("成分: ");
		greenPearlMilk.getMeterials().stream().forEach(meterial -> System.out.print(meterial.getName() + " "));
		System.out.println();
		
		greenPearlMilk.getMeterials().stream()
								.forEach(meterial -> System.out.println(meterial.getName() + ": $" + meterial.getPrice()));
	}
}
