package com.pcschool.ocp.finish.d07.case1.food;

import java.util.ArrayList;
import java.util.Arrays;

import com.pcschool.ocp.finish.d07.case1.material.Material;

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
	
	/*****************
	 * init material *
	 *****************/
	public void addMaterials(Material... materials) {
		Arrays.stream(materials).forEach(this.materials::add);
	}
	
	/********************
	 * add new material *
	 ********************/
	public void addMaterial(Material material) {
		materials.add(material);
		addName(material);
	}
	
	public int getPrice() {
		return materials.stream().mapToInt(Material::getPrice).sum();
	}

	private void addName(Material material) {
		name = name.concat(" + " + material.getName());
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
