package com.pcschool.ocp.d15_thread.case1;

public class Account {
	private int balance; // 執行緒共享

	public Account(int balance) {
		this.balance = balance;
	}

	public synchronized void withdraw(int money) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 進行提款\n", tName);

		int current_balance = balance;
		// 檢查目前帳戶餘額

		// 模擬系統運行時間
		for (int i = 0; i < Integer.MAX_VALUE; i++)
			;
		// 進行假提領
		current_balance -= money;
		if (current_balance >= 0) { // 餘額充足,可以提款
			balance = current_balance; // 將醉心餘額寫入 balance
			System.out.printf("%s 提款 %d 成功, 帳戶餘額: %d\n", tName, money, balance);
		} else {
			System.out.printf("%s 提款 %d 失敗, 帳戶餘額: %d\n", tName, money, balance);
		}

	}

}
