package com.pcschool.ocp.finish.d02;

import java.util.Arrays;

public class MultiArray4 {
	public static void main(String[] args) {
		int[][][] x = {{{100, 90, 80}, {70, 60}}, {{70, 60}}, {{50}}};
		Arrays.stream(x).forEach(x3 -> Arrays.stream(x3).forEach(x1 -> Arrays.stream(x1).forEach(x2 -> System.out.println(x2))));
	}
}
