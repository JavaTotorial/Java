package com.pcschool.ocp.d16_derby.case4_book;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
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
		System.out.println("=======================");
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
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入書名: ");
		String bname = scanner.nextLine();
		System.out.print("請輸入價格: ");
		int price = scanner.nextInt();
		Book book = new Book();
		book.setBname(bname);
		book.setPrice(price);
		boolean check = crud.addBook(book);
		System.out.println("新增" + (check ? "成功" : "失敗"));
	}

	// 修改
	public static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入欲修改的id: ");
		int id = scanner.nextInt();
		Book book = crud.getBook(id);
		if (book == null) {
			System.out.println("查無此紀錄");
			return;
		}

		System.out.print("是否要修改書名(y/n):");
		if (scanner.next().equals("y")) {
			System.out.print("請輸入欲修改的書名: ");
			book.setBname(scanner.next());
		}

		System.out.print("是否要修改價格(y/n):");
		if (scanner.next().equals("y")) {
			System.out.print("請輸入欲修改的價格: ");
			book.setPrice(scanner.nextInt());
		}

		boolean check = crud.updateBook(book);
		System.out.println("修改" + (check ? "成功" : "失敗"));
	}

	// 刪除
	public static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入欲刪除的id: ");
		int id = scanner.nextInt();
		boolean check = crud.deleteBook(id);
		System.out.println("刪除" + (check ? "成功" : "失敗"));
	}

	// 查詢單筆
	public static void get() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入欲查詢的id: ");
		int id = scanner.nextInt();
		display(Arrays.asList(crud.getBook(id)));
	}

	// 查詢全部
	public static void query() {
		display(crud.queryAll());
	}
	
	// 排版
	public static void display(List<Book> books) {
		String leftAlignFormat = "| %-4d | %-15s |  %-5d| %-25s |%n";
		System.out.format("+------+-----------------+-------+---------------------------+%n");
		System.out.format("|  ID  |    Book name    | Price |         Timestamp         |%n");
		System.out.format("+------+-----------------+-------+---------------------------+%n");
		for (Book book : books) {
			System.out.format(leftAlignFormat, book.getId(), book.getBname(), book.getPrice(), book.getTs());
		}
		System.out.format("+------+-----------------+-------+---------------------------+%n");
	}

}
