package com.pcschool.ocp.finish.d09.case9;

public enum Salary {

	OPERATOR(23000),
	PROGRAMMER(45000),
	MANAGER(75000),
	BOSS(1);

	private int money;

	private Salary(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

}
