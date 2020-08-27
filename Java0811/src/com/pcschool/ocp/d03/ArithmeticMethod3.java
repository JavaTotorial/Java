package com.pcschool.ocp.d03;

import java.util.Arrays;
import java.util.Comparator;

public class ArithmeticMethod3 {
	public static void main(String[] args) {
		BMI[] bmis = { new BMI(170, 60), new BMI(160, 60.5), new BMI(180, 65.5) };

		// Java 8
		Arrays.stream(bmis).forEach(bmi -> System.out.println(bmi));
		System.out.println("================================");
		
		Arrays.stream(bmis).filter(bmi -> bmi.getBmi() >= 18 && bmi.getBmi() <= 23).forEach(b -> System.out.println(b));
		System.out.println("================================");
		
		Arrays.stream(bmis).sorted(Comparator.comparing(BMI::getBmi)).filter(bmi -> bmi.getBmi() >= 18 && bmi.getBmi() <= 23).forEach(b -> System.out.println(b));
		System.out.println("================================");
	}
}

class BMI {
	private double h;
	private double w;
	private double bmi;

	public BMI(double h, double w) {
		this.h = h;
		this.w = w;
		bmi = Double.parseDouble(String.format("%.2f", w / Math.pow(h / 100, 2)));
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