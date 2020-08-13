package com.pcschool.ocp.d03;

public class ArithmeticMethod3 {
	public static void main(String[] args) {
		double[][] bmis = { { 170, 60 }, { 160, 60.5 }, { 180, 65.5 } };
		
	}
}

class BMI {
	private double h;
	private double w;
	private double bmi;
	
	public BMI(double h, double w) {
		this.h = h;
		this.w = w;
		bmi = w / Math.pow(h/100, 2);
	}

	public double getH() {
		return h;
	}

	public double getW() {
		return w;
	}

	public double getBmi() {
		return bmi;
	}

	@Override
	public String toString() {
		return "BMI [h=" + h + ", w=" + w + ", bmi=" + bmi + "]";
	}
	
	
}