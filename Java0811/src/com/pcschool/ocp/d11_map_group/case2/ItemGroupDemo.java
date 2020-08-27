package com.pcschool.ocp.d11_map_group.case2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class ItemGroupDemo {
	public static void main(String[] args) {
		List<Item> items = Arrays.asList(
				new Item("蘋果", 10, new BigDecimal("9.99")),
                new Item("香蕉", 20, new BigDecimal("19.99")),
                new Item("橘子", 10, new BigDecimal("29.99")),
                new Item("西瓜", 10, new BigDecimal("29.99")),
                new Item("木瓜", 20, new BigDecimal("9.99")),
                new Item("蘋果", 10, new BigDecimal("9.99")),
                new Item("香蕉", 10, new BigDecimal("19.99")),
                new Item("蘋果", 20, new BigDecimal("9.99"))
		);
		
		// 每一種水果各有幾組 ?
		Map<String , Long> group1 = items.parallelStream()
				.collect(groupingBy(Item::getName, counting()));
		System.out.println(group1);
		
		// 每一種水果各有幾個 (將同類的每一箱水果數量(qty)進行加總(summingInt)) ?
		Map<String , Integer> group2 = items.parallelStream()
				.collect(groupingBy(Item::getName, summingInt(Item::getQty)));
		System.out.println(group2);
		
		// 依照價格(price)分類水果
		Map<BigDecimal, List<Item>> group3 = items.parallelStream()
			.collect(groupingBy(Item::getPrice));
		System.out.println(group3);
		
		// 依照價格(price)分類水果名字
		Map<BigDecimal, Set<String>> group4 = items.parallelStream()
				.collect(groupingBy(Item::getPrice, mapping(Item::getName, toSet())));
		System.out.println(group4);
	}
}
