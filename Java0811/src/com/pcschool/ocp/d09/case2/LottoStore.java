package com.pcschool.ocp.d09.case2;

import java.util.Random;

public class LottoStore {
	public static void main(String[] args) {
		// 實作 lotto 介面列出 0 ~ 9 一個數字
		/*******************
		 * class implement *
		 *******************/
		LottoOne lotto1 = new LottoOne();
		lotto1.printNumber();

		System.out.println("================");

		/**************************
		 * Java 7 Anonymous class *
		 **************************/
		new Lotto() {
			@Override
			public void printNumber() {
				System.out.println(new Random().nextInt(10));
			}
		}.printNumber();

		System.out.println("================");

		/**************************
		 * Java 8 Anonymous class *
		 **************************/
		Lotto lotto3 = () -> System.out.println(new Random().nextInt(10));
		lotto3.printNumber();

		System.out.println("================");

		// 實作 lotto 介面列出 0 ~ 9 四個數字
		int num = 4;
		/*******************
		 * class implement *
		 *******************/
		LottoFour lotto4 = new LottoFour();
		lotto4.printNumber();

		System.out.println("================");

		/**************************
		 * Java 7 Anonymous class *
		 **************************/
		new Lotto() {
			@Override
			public void printNumber() {
				Random r = new Random();
				for (int i = 0; i < num; i++)
					System.out.print(r.nextInt(10));
				System.out.println();
			}
		}.printNumber();

		System.out.println("================");

		/**************************
		 * Java 8 Anonymous class *
		 **************************/
		Lotto lotto6 = () -> {
			for (int i = 0; i < num; i++)
				System.out.print(new Random().nextInt(10));
		};
		lotto6.printNumber();
		System.out.println();
	}
}
