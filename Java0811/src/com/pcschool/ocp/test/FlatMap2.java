package com.pcschool.ocp.test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class FlatMap2 {
	public static void main(String[] args) {
		String[][] names = {
				{"John", "Marry"},
				{"Java", "Python", "VB"},
				{"Android", "iPhone"}
		};
		
		
		IntSummaryStatistics stat = Arrays.stream(names)
											.flatMap(Arrays::stream)
											.mapToInt(String::length)
											.summaryStatistics();
		
		// 請問共有幾個字母 ?
		System.out.printf("共有   %d 個字母\n", stat.getSum());
		
		// 長度最長的是幾個字 ?
		System.out.printf("最長的是   %d 個字\n", stat.getMax());
		
		// 長度最短的是幾個字 ?
		System.out.printf("最短的是   %d 個字\n", stat.getMin());
		
	}
}
