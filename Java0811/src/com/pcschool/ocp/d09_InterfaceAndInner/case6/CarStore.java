package com.pcschool.ocp.d09_InterfaceAndInner.case6;

public class CarStore {
	public static void main(String[] args) {
		// 透過 Rideable 的 getCar(name) 取得 Car
		Rideable rideable = car -> new Car(car);
		
		Car car = rideable.getCar("BMW");
		System.out.println(car);
		
		// lambda ::
		Rideable rideable2 = Car::new;
		Car car2 = rideable2.getCar("BMW");
		System.out.println(car2);
	}
}
