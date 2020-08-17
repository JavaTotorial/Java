package com.pcschool.ocp.finish.d03;

import java.util.Arrays;
import java.util.Random;

public class ArithmeticMethod2 {
	public static void main(String[] args) {
		int[] scores = new int[10];
		Random random = new Random();

		for (int i = 0; i < scores.length; i++)
			scores[i] = random.nextInt(100);

		// Java
		Arrays.stream(scores).forEach(score -> System.out.print(score + " "));
		System.out.println();
		
		// 排序
		Arrays.stream(scores).sorted().forEach(score -> System.out.print(score + " "));
		System.out.println();
		
		// 過濾
		Arrays.stream(scores).sorted().filter(score -> score >= 60).forEach(sc -> System.out.print(sc + " "));
		System.out.println();
	}
}
