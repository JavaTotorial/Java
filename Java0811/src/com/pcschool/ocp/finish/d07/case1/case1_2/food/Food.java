package com.pcschool.ocp.finish.d07.case1.case1_2.food;

import java.util.Arrays;

import com.pcschool.ocp.finish.d07.case1.case1_2.material.Material;

public class Food {

	private String name;

	private Material[] materials;

	public Food() {
	}

	public Food(String name) {
		setName(name);
	}

	public int getPrice() {
		return Arrays.stream(materials).mapToInt(m -> m.getPrice()).sum();
	}

	public Food addMaterial(Material material) {
		Material[] new_materials = Arrays.copyOf(materials, materials.length + 1);
		new_materials[new_materials.length - 1] = material;
		setMaterials(new_materials);
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Material[] getMaterials() {
		return materials;
	}

	public void setMaterials(Material[] materials) {
		this.materials = materials;
	}

}
