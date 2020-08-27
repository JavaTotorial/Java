package com.pcschool.ocp.d09_InterfaceAndInner.case7;

public class CalcMain {
	public static void main(String[] args) {
		Calc<Integer> calc = n -> System.out.println(n + n);
		calc.add(10);
		
		Calc<String> calc2 = n -> System.out.println(n + n);
		calc2.add("10");
	}
}
