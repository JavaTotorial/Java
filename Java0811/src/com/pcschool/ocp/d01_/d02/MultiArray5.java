package com.pcschool.ocp.d01_.d02;

import java.util.Scanner;

public class MultiArray5 {
	public static void main(String[] args) {
		char[][] ttt = {
				{'O', 'O', 'X'},
				{'X', 'O', '\0'},
				{'X', '\0', 'X'}
				};
		
		int pos = new Scanner(System.in).nextInt() - 1;
		int x = pos / 3;
		int y = pos % 3;
		System.out.println(x + " " + y);
		
		ttt[2][1] = 'O';

		for(int i = 0;i < ttt.length;i++) 
			System.out.println(ttt[i]);
		
	}
}
