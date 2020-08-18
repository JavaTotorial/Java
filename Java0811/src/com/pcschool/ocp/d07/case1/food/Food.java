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
		setName(name);
	}

	public void addMeterials(Material... materials) {
		Arrays.stream(materials).forEach(this.materials::add);
	}

	public int getPrice() {
		return materials.stream().mapToInt(Material::getPrice).sum();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Material> getMaterials() {
		return materials;
	}

}
