package com.pcschool.ocp.finish.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(100);
		set.add(90);
		set.add(80);
		System.out.println(set);

		Iterator<Integer> iter = set.iterator();
		int sum = 0;
		while(iter.hasNext())
			sum += iter.next();
		System.out.println(sum);
		
		// Java 8
		sum = set.parallelStream().mapToInt(i -> i).sum();
		System.out.println(sum);
	}
}
