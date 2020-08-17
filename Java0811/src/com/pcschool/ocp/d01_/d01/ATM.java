package com.pcschool.ocp.d01_.d01;

import java.util.Scanner;

public class ATM {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Account account = new Account();
		run(account);
	}
	
	public static void run(Account account) {
		System.out.println("系統選單");
		System.out.println("=============");
		System.out.println("1.存款");
		System.out.println("2.提款");
		System.out.println("3.查詢");
		System.out.println("9.離開");
		System.out.println("=============");
		System.out.print("請選擇: ");
		int choose = scanner.nextInt();
		
		switch (choose) {
		case 1:
			System.out.print("請輸入存款金額: $");
			int saveMoney = scanner.nextInt();
			account.withdraw(saveMoney);
			break;
		case 2:
			System.out.print("請輸入提款金額: $");
			int withdrawMoney = scanner.nextInt();
			account.withdraw(withdrawMoney);
			break;
		case 3:
			System.out.println(account);
			break;
		case 9:
			System.out.println("結束系統...");
			return;
		}
		
		System.out.print("按下Enter鍵繼續...");
		new Scanner(System.in).nextLine();
		run(account);
	}
}
