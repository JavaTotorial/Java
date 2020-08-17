package com.pcschool.ocp.finish.d03;

import java.util.Random;

public class ArithmeticMethod {
	public static void main(String[] args) {
		char[] poker = "A234567890JQK".toCharArray();
		
		// shuffle
		Random r = new Random();
		for(int i = 0;i < 100;i++) {
			int from = r.nextInt(poker.length);
			int to = r.nextInt(poker.length);
			char c = poker[to];
			poker[to] = poker[from];
			poker[from] = c;
		}

		// print
		for(char p : poker)
			System.out.print(p + " ");
		System.out.println();
	}
}
