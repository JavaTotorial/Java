package com.pcschool.ocp.finish.d08.army;

public class Fighter extends Airplane implements Weapon {
	
	public Fighter() {
		System.out.println("Fighter...");
	}
	
	@Override
	void move() {
		System.out.println("Fighter 是用飛的...");
	}

	@Override
	public void shoot() {
		System.out.println("發射火狐狸...");
	}
}
