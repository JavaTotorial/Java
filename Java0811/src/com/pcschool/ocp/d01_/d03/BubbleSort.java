package com.pcschool.ocp.d01_.d03;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] x = {18, 17, 17, 16};
		for(int i = x.length-1;i > 0;i--)
			for(int j = 0;j < i;j++)
				if(x[j] > x[j+1]) {
					int t = x[j];
					x[j] = x[j+1];
					x[j+1] = t;
				}
		
		Arrays.stream(x).forEach(i -> System.out.print(i + " "));
	}
}
