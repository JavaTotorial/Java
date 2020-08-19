package com.pcschool.ocp.d08.case3;

import java.util.Arrays;

public class PetStore {
	public static void main(String[] args) {
		Pet[] pets = {new EDog(), new Yorkshire(), new Chihuahua(), new Persian()};
		
		// 狗都吃甚麼
		Arrays.stream(pets).filter(pet -> pet instanceof Dog).forEach(Pet::eat);
		
		System.out.println("===");
		
		// 貓都吃甚麼
		Arrays.stream(pets).filter(pet -> pet instanceof Cat).forEach(Pet::eat);
		
		System.out.println("===");
		
		// 寵物店的腿數共有幾隻?
		System.out.println(pets.length * Pet.legs);
	}
}
