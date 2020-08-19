package com.pcschool.ocp.test;

import java.util.Arrays;

public class FlatMap {
	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 80 }, { 70, 60, 50 } };
		
		// 算加總
		// Java 7
		int sum = 0;
		for (int[] score : scores)
			for (int i : score)
				sum += i;
		System.out.println("Java 7: " + sum);

		// Java 8 non-flatmap
		sum = 0;
		for (int[] score : scores)
			sum += Arrays.stream(score).sum();
		System.out.println("Java 8 non-flatmap: " + sum);

		// Java 8 flatmap
		sum = Arrays.stream(scores).flatMapToInt(Arrays::stream).sum();
		System.out.println("Java 8 flatmap: " + sum);

		/*******************************************
		 * flatmap: 將 2 維陣 stream 轉為 1 維的 stream *
		 *******************************************/
	}
}
