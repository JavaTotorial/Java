package com.pcschool.ocp.d10.case3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

@SuppressWarnings("all")
public class SetDemo2 {
	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		set.add(new Integer(100));
		set.add("國文");
		set.add(80);
		set.add(new String("英文"));
		set.add("數學");
		set.add(90);
		System.out.println(set.toString());
		
		Iterator iter = set.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			Object data = iter.next();
			System.out.print(data + " ");
			if(data instanceof Integer)
				sum += (int)data;
		}
		System.out.println("\n" + sum);
	}
}
