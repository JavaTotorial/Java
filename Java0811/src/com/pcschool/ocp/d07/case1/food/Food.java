package com.pcschool.ocp.d07.case1.food;

import java.util.ArrayList;
import java.util.Arrays;

import com.pcschool.ocp.d07.case1.material.Material;

public class Food {
 
	private String name;
	private ArrayList<Material> materials;
	 
	public Food() {
		materials = new ArrayList<>();
	}
	 
	public Food(String name) {
		this();
		this.name = name;
	}
	 
	public void addMeterials(Material... materials) {
		Arrays.stream(materials).forEach(material -> this.materials.add(material));
	}
	 
	public int getPrice() {
		return materials.stream().mapToInt(material -> material.getPrice()).sum();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Material> getMaterials() {
		return materials;
	}
	 
}
 
