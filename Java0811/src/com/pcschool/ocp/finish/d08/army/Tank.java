package com.pcschool.ocp.finish.d08.army;

public class Tank extends Car implements Weapon {
	
	public Tank() {
		System.out.println("Tank...");
	}
	
	@Override
	public void shoot() {
		System.out.println("發射　105　榴炮");
	}
	@Override
	void move() {
		System.out.println("Tank 是用履帶走的...");
	}
}
