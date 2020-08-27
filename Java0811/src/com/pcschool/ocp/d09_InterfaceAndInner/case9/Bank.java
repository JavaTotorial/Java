package com.pcschool.ocp.d09_InterfaceAndInner.case9;

public class Bank {
	public static void main(String[] args) {
		// PENNY=1, NICKLE=5, DIME=10, QUARTER=25
		
		// 3 個 NICKLE
		USCurrency us = USCurrency.DIME;
		System.out.println(us.getValue());
	}
}
