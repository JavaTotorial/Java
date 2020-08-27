package com.pcschool.ocp.d02;

import java.util.Arrays;

public class MultiArray2 {
	public static void main(String[] args) {
		int[][] x = new int[][] { { 100, 90, 80 }, { 70, 60, 50 }, {40, 30}, {20} };
		Arrays.stream(x).forEach(x1 -> Arrays.stream(x1).forEach(x2 -> System.out.println(x2)));
	}
}
