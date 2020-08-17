package com.pcschool.ocp.finish.d02;

import java.util.Arrays;

public class MultiArray6 {
	public static void main(String[] args) {
		int[] scores = {100, 90, 80};
		
		for(int i : scores)
			System.out.print(i + " ");
							 //	|
							 // |
		System.out.println();// V
		Arrays.stream(scores).forEach(i -> System.out.print(i + " "));

		System.out.println();
		Arrays.stream(scores).filter(i -> i >= 90).forEach(score -> System.out.println(score));
	}
}
