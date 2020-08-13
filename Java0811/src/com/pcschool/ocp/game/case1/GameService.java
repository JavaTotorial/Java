package com.pcschool.ocp.game.case1;

import java.util.Scanner;

public class GameService {
	static Scanner scanner = new Scanner(System.in);
	
	public static void start() {
		System.out.println("Java Guess Game");
		while(true) {
			System.out.println("===============");
			System.out.println("1. 猜數字");
			System.out.println("2. 猜字母");
			System.out.println("9. 離開");
			System.out.println("===============");
			System.out.print("請選擇: ");
			int mode = scanner.nextInt();
			System.out.println("===============");
			
			switch (mode) {
			case 1:
				NumberGameLoop();
				break;
			case 2:
				AlphabetGameLoop();
				break;
			case 9:
				System.out.println("離開系統");
				return;
			}
			System.out.print("按下Enter鍵繼續");
			new Scanner(System.in).nextLine();
		}
	}
	
	public static void NumberGameLoop() {
		Number number = new Number();
		int userAns, result;
		while (true) {
			System.out.print("請輸入數字: ");
			userAns = scanner.nextInt();
			result = number.check(userAns);

			if (result == 0) {
				System.out.printf("猜對了!猜了 %d 次\n", number.getCount());
				break;
			} else
				System.out.printf("太%s了!\n", result > 0 ? "大" : "小");
		}
	}
	
	public static void AlphabetGameLoop() {
		Alphabet alphabet = new Alphabet();
		int result, userAns; 

		while(true) {
			System.out.print("請輸入英文字母: ");
			userAns = scanner.next().toUpperCase().charAt(0);
			result = alphabet.check(userAns);
			if (result == 0) {
				System.out.printf("猜對了!猜了 %d 次\n", alphabet.getCount());
				break;
			} else
				System.out.printf("太%s了!\n", result > 0 ? "大" : "小");
		}
	}

}
