package com.pcschool.ocp.d01_.d01;

public class Account {
	private int balance = 10000;

	public void save(int balance) {
		System.out.printf("存款: %d元\n", balance);
		if (balance < 0) {
			System.out.println("存款金額需0");
			return;
		}
		this.balance += balance;
	}
	
	public void withdraw(int balance) {
		System.out.printf("提款: %d元\n", balance);
		if (balance < 0) {
			System.out.println("存款金額需0");
			return;
		} else if (balance > this.balance) {
			System.out.println("帳戶餘額不足");
			return;
		}
		this.balance -= balance;
	}
	
	@Override
	public String toString() {
		return "帳戶餘額: $" + balance;
	}
}
