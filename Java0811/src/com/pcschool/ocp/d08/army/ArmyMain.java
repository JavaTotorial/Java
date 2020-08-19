package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {
	public static void main(String[] args) {
		Airplane[] airplanes = { new Fighter(), new Fighter(), new Fighter() };
		Car[] cars = { new Tank(), new Truck(), new Truck(), new Tank() };
		Weapon[] weapons = { new Fighter(), new Tank() };

		System.out.println("================");

		// cars 要統一發射武器
		Arrays.stream(cars).filter(car -> car instanceof Weapon).map(c -> (Weapon) c).forEach(Weapon::shoot);

		// weapons 要統一發射武器
		Arrays.stream(weapons).forEach(Weapon::shoot);

	}
}
