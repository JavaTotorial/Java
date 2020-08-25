package com.pcschool.ocp.finish.d12_exception.case4;

public class UnCheckedAndChecked {
	public static void main(String[] args) {
		a(0);
		b(0);
		try {
			c(0);
		}catch (ArithmeticException e) {
			System.out.println("main 自行處理數學錯誤: " + e);
		}
		try {
			d(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void a(int d) {
		int x = 10;
		try {
			int result = x / d;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("分母不可為 0" + e);
		}
	}

	public static void b(int d) {
		int x = 10;
		if (d == 0) {
			System.out.println("分母不可為 0");
			return;
		}
		int result = x / d;
		System.out.println(result);
	}

	public static void c(int d) {
		int x = 10;
		int result = x / d;
		System.out.println(result);
	}
	
	public static void d(int d) throws Exception {
		int x = 10;
		if (d == 0) {
			throw new Exception("d 說: 分母不可為 0");
		}
	}
}
