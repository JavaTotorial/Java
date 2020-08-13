package com.pcschool.ocp.d03.foodshop;

import java.util.Scanner;

public class SetFood {
	private Leg[] leg;
	private Breast[] breast;
	private Wings[] wings;
	private Cola[] cola;
	private int price;
	
	public SetFood() {
		int set = menu();
		switch (set) {
		case 1:
			SetA();
			break;
		case 2:
			SetB();
			break;
		case 3:
			SetC();
			break;
		case 4:
			SetPerson();
		}
		SetPrice();
	}
	
	private int menu() {
		System.out.println("餐點選單");
		System.out.println("==========");
		System.out.println("1. A套餐");
		System.out.println("2. B套餐");
		System.out.println("3. C套餐");
		System.out.println("4. 自選");
		System.out.println("==========");
		System.out.print("請選擇: ");
		int set = new Scanner(System.in).nextInt();
		System.out.println("==========");
		return set;
	}
	
	private void SetA() {
		Set A = new Set(4, 2, 3, 4);
		leg = A.getLeg();
		breast = A.getBreast();
		wings = A.getWings();
		cola = A.getCola();
	}
	
	private void SetB() {
		Set A = new Set(7, 3, 5, 6);
		leg = A.getLeg();
		breast = A.getBreast();
		wings = A.getWings();
		cola = A.getCola();
	}
	
	private void SetC() {
		Set A = new Set(1, 1, 1, 1);
		leg = A.getLeg();
		breast = A.getBreast();
		wings = A.getWings();
		cola = A.getCola();
	}
	
	private void SetPrice() {
		price += leg.length != 0 ? leg[0].getPrice() * leg.length : 0;
		price += breast.length != 0 ? breast[0].getPrice() * breast.length : 0; 
		price += wings.length != 0 ? wings[0].getPrice() * wings.length : 0; 
		price += cola.length != 0 ? cola[0].getPrice() * cola.length : 0; 
	}

	private void SetPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入雞腿數量: ");
		int legCount = scanner.nextInt();
		System.out.print("請輸入雞胸數量: ");
		int breastCount = scanner.nextInt();
		System.out.print("請輸入雞翅數量: ");
		int wingsCount = scanner.nextInt();
		System.out.print("請輸入可樂數量: ");
		int colaCount = scanner.nextInt();
		
		Set person = new Set(legCount, breastCount, wingsCount, colaCount);
		leg = person.getLeg();
		breast = person.getBreast();
		wings = person.getWings();
		cola = person.getCola();
	}

	public int getPrice() {
		return price;
	}
}
