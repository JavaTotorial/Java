package com.pcschool.ocp.d11_map_group;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("英文", 100);
		exams.put("數學", 90);
		System.out.println(exams);
		
		System.out.println("==========================");
		
		// 走訪元素 1
		System.out.println(exams.get("國文"));
		System.out.println(exams.get("英文"));
		System.out.println(exams.get("數學"));
		
		System.out.println("==========================");
		
		// 走訪元素 2
		for(String s : exams.keySet()) 
			System.out.println(s + "=" + exams.get(s));
		
		System.out.println("==========================");
	
		// 走訪元素 3
		Set<Entry<String, Integer>> entrySet = exams.entrySet();
		for(Entry<String, Integer> entry : entrySet) 
			System.out.println(entry.getKey() + "=" + entry.getValue());
		
		System.out.println("==========================");
		
		// 走訪元素 4 (可以利用 iterator.remove() 來移除元素)
		Iterator<Entry<String, Integer>> iter = exams.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> data = iter.next();
			System.out.println(data.getKey() + "=" + data.getValue());
		}
		
		System.out.println("==========================");
	
		// 走訪元素 5 Java 8
		exams.forEach((key, value) -> System.out.println(key + "=" + value));
	
		System.out.println("==========================");
		
		// 走訪元素 6 Java 8 stream
		exams.entrySet().parallelStream().forEachOrdered(e -> System.out.println(e.getKey() + "=" + e.getValue()));
	}
}
