package com.pcschool.ocp.d10_ListAndSet.case3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@SuppressWarnings("all")
public class SetDemo {
	public static void main(String[] args) {
		// HashSet 按照 HashCode 排序
		Set s1 = new HashSet();
		s1.add(100);
		s1.add(90);
		s1.add(80);
		System.out.println(s1);
		
		// LinkedHashSet 按照放入順序
		Set s2 = new LinkedHashSet();
		s2.add(100);
		s2.add(90);
		s2.add(80);
		System.out.println(s2);
		
		// TreeSet 由小到大排序
		Set s3 = new TreeSet();
		s3.add(100);
		s3.add(90);
		s3.add(80);
		System.out.println(s3);
		
	}
}
