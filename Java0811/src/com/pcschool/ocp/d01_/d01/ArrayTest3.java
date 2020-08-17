package com.pcschool.ocp.d01_.d01;

import java.util.Arrays;

public class ArrayTest3 {
	public static void main(String[] args) {
		double[] height = {172, 168, 164, 170, 176};
		// Java 7
		double sum = 0;
		double avg = 0;
		for(int i = 0, len = height.length;i < len;i++)
			sum += height[i];
		avg = sum / height.length;
		System.out.printf("平均(Java 7): %.2f cm\n", avg);
		
		Arrays.sort(height);
		double max = height[height.length-1];
		System.out.println("最大值(Java 7): " + max);
		double min = height[0];
		System.out.println("最大值(Java 7): " + min);
		
		// Java 8
		Arrays.stream(height).forEach(h -> System.out.println(h));
		double sum2 = Arrays.stream(height).sum();
		double avg2 = Arrays.stream(height).average().getAsDouble();
		System.out.println("數量: " + Arrays.stream(height).count());
		System.out.printf("平均(Java 8): %.2f cm\n", avg2);
		System.out.println("最大值(Java 8): " + Arrays.stream(height).max().getAsDouble());
		System.out.println("最小值(Java 8): " + Arrays.stream(height).min().getAsDouble());
	}
}
