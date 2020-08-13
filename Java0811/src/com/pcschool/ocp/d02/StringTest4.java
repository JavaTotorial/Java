package com.pcschool.ocp.d02;

public class StringTest4 {
	public static void main(String[] args) {
		String s = new String("Java");
		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println(s);
		System.out.println(sb + "\n"); 
		
		update(s);
		update(sb);
		
		System.out.println(s);
		System.out.println(sb);
	}

	public static void update(String s) {
		s = s.concat("8");
	}

	public static void update(StringBuilder sb) {
		sb.append("8");
	}
}
