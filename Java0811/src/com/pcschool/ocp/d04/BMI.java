package com.pcschool.ocp.d04;

public class BMI {
	private double h = 170; // 100 ~ 250 (default: 170)
	private double w = 60; // 30  ~ 150 (default: 60)
	private double bmi;
	
	public BMI(double h, double w) {
		if(h >= 100 && h <= 250)
			this.h = h;
		if(w >= 30 && w <= 150)
			this.w = w;
		bmi = Double.parseDouble(String.format("%.2f", (this.w / Math.pow(this.h/100, 2))));
	}

	public BMI() {
		this(170, 60);
	}

	public BMI(double h) {
		this(h, 60);
	}

	@Override
	public String toString() {
		return "BMI [h=" + h + ", w=" + w + ", bmi=" + bmi + "]";
	}
}
