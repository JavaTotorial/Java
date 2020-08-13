package com.pcschool.ocp.game.case2;

import java.util.Scanner;

public class GuessService {
    static Scanner scanner = new Scanner(System.in);
	public static void menu() {
		System.out.println("   Game Menu");
		while(true) {
			System.out.println("================");
			System.out.println("1. 猜數字");
			System.out.println("9. 離開");
			System.out.println("================");
			System.out.print("請選擇: ");
			int mode = scanner.nextInt();
			System.out.println("================");
			
			switch (mode) {
			case 1:
				GuessLoop();
				break;
			case 9:
				System.out.println("離開系統");
				return;
			}
			System.out.println("按下 Enter 鍵繼續~");
			new Scanner(System.in).nextLine();
		}
	}
	
	public static void GuessLoop() {
		Guess guess = new Guess();
		
		System.out.print("請輸入數字長度: ");
		int len = scanner.nextInt();
		int[] ans = Util.getRandomIntArray(len);
		String input;
		boolean check;
		
		while(true) {
			System.out.printf("請輸入一不重複的 %d 位數: ", len);
			input = scanner.next();
			
			try {
				check = guess.checkAB(input, ans);
			}catch (getException e) {
				return;
			}
			if(check) {
				System.out.printf("猜對了~猜了 %d 次\n", guess.getCount());
				break;
			}
		}
	}
}
