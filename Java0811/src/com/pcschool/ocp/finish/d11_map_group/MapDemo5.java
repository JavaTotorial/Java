package com.pcschool.ocp.finish.d11_map_group;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo5 {
	public static void main(String[] args) {
		List<Integer> scores = Arrays.asList(100, 90, 50, 70, 40);
		// 及格與不及格各有幾人
		// true: 3, false: 2
		System.out.println(
				scores.stream().collect(Collectors.groupingBy(s -> s >= 60 ? "及格" : "不及格", Collectors.counting()))
		);
	}
}
