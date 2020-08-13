package com.pcschool.ocp.d01;

public class BMI {
	public String name;
	private double h;
	private double w;
	private double bmi;
	
	public double calcBMI() {
		return w / Math.pow(h/100, 2);
	}
	
}
