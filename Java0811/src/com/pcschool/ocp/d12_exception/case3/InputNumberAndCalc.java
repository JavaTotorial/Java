package com.pcschool.ocp.d12_exception.case3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumberAndCalc {
	public static void main(String[] args) {
		input();
	}

	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入分母: ");
		try {
			int d = scanner.nextInt();
			int result = calc(d);
			print(result);
		} catch (InputMismatchException e) {
			System.out.println("\033[1m\u001b[31m輸入錯誤, 請重新輸入!\u001b[0m");
			input();
		} catch (ArithmeticException e) {
			System.out.println("\\033[1m\u001b[31m發生了數學錯誤, 分母不可為零, 請重新輸入!\u001b[0m");
			input();
		}
	}

	public static int calc(int denominator) { // denominator 分母
		int result = 100 / denominator;
		return result;
	}
	public static void print(int result) {
		System.out.printf("result = %d\n", result);
	}
}
