package com.pcschool.ocp.school;

public class BMI {
	private double height;
	private double weight;
	private double bmi;
	
	public BMI(double height, double weight) {
		this.height = height;
		this.weight = weight;
		setBmi();
	}
	
	public double getBmi() {
		return bmi;
	}
	private void setBmi() {
		bmi = Double.parseDouble(String.format("%.2f", weight / Math.pow(height/100, 2)));
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}

	@Override
	
	public String toString() {
		return ", height=" + height + ", weight=" + weight + ", bmi=" + bmi;
	}

	
}
