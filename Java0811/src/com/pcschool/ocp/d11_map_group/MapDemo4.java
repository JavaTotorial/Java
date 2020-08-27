package com.pcschool.ocp.d11_map_group;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class MapDemo4 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"John", "Helen", "Mary", 
				"Happy", "Jo", "Vincent");
		System.out.println(
				names.stream()
						.collect(Collectors.groupingBy(String::length, Collectors.counting()))
		);
		System.out.println(
				names.stream()
						.collect(groupingBy(String::length, counting()))
		);
		Map<Integer, Long> group1 = names.stream().collect(groupingBy(String::length, counting()));
		System.out.println(group1);
	}
}
