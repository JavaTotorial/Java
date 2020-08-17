package com.pcschool.ocp.d01_.d01;

import java.util.Arrays;

public class ArrayTest1 {
	public static void main(String[] args) {
		int[] scores = {100, 90, 83, 70};
		
		Arrays.stream(scores).forEach(score -> System.out.println(score));
		
		System.out.println(scores.length);
		
		int sum = 0;
		for(int i = 0, len = scores.length;i < len;i++)
			sum += scores[i];
		
		double avg = (double)sum / scores.length;
		System.out.println("總分: " + sum);
		System.out.println("平均: " + avg);
		double sum2 = 0;
		for(int i = 0,len = scores.length;i < len;i++) 
			sum2 += Math.pow(scores[i]-avg, 2);
		double sigma = Math.sqrt(sum2/scores.length);
		System.out.printf("標準差: %.2f\n", sigma);
		
		double cv = sigma / avg;
		System.out.printf("變異係數: %.2f", cv);
		
		
	}
}
