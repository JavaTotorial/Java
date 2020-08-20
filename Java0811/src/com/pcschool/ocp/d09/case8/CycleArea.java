package com.pcschool.ocp.d09.case8;

import java.util.Arrays;
import java.util.function.Supplier;

public class CycleArea {
	public static void main(String[] args) {
		Supplier<Double> pi = () -> Math.PI;
		
		int[] rs = { 5, 10, 15, -4, 20, 0, -25 };

		// @formatter:off
		Arrays.stream(rs)
				.filter(r -> r > 0) 			// Predicate<Integer>
				.mapToDouble(r-> r*r*pi.get()) 	// Function<Integer, Double>, Supplier<Double>
				.forEach(System.out::println); 	// Consumer<Double>
	}
}
