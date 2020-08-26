package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.SQLException;
import java.util.Scanner;

public class BookClient {
	private static BookCRUD crud = new BookCRUD();

	public static void main(String[] args) throws SQLException {
		menu();
	}

	public static void menu() {
		System.out.println("=======================");
		System.out.println("1.新增");
		System.out.println("2.修改");
		System.out.println("3.刪除");
		System.out.println("4.查詢單筆");
		System.out.println("5.查詢全部");
		System.out.println("9.離開系統");
		System.out.println("=======================");
		Scanner scanner = new Scanner(System.in);
		System.out.print("請選擇: ");
		int choice = scanner.nextInt();
		System.out.println("=======================");
		if (choice == 9)
			return;
		service(choice);
		System.out.print("按下 Enter 鍵繼續");
		new Scanner(System.in).nextLine();
		menu();
	}

	public static void service(int choice) {
		switch (choice) {
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			delete();
			break;
		case 4:
			get();
			break;
		case 5:
			query();
			break;
		}
	}

	// 新增
	public static void add() {

	}

	// 修改
	public static void update() {

	}

	// 刪除
	public static void delete() {

	}

	// 查詢單筆
	public static void get() {

	}

	// 查詢全部
	public static void query() {

	}

}
