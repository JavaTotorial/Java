package com.pcschool.ocp.school;

public class BMI {
	private int height;
	private double weight;
	private double bmi;
	
	public BMI(int height, double weight) {
		this.height = height;
		this.weight = weight;
		setBmi();
	}
	
	public double getBmi() {
		return bmi;
	}
	private void setBmi() {
		bmi = weight / Math.pow(height/100, 2);
	}
	public int getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	@Override
	
	public String toString() {
		return ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}

	
}
