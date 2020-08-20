package com.pcschool.ocp.d09.case3;

import java.util.Random;

public class LottoStore {
	public static void main(String[] args) {
		Lotto one = new Lotto() {
			@Override
			public void printNumber() {
				System.out.println(new Random().nextInt(10));
			}
		};
		one.printNumber();
		
		// lambda
		Lotto one2 = () -> System.out.println(new Random().nextInt(10));
		one2.printNumber();
	} 
}
