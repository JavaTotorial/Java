package com.pcschool.ocp.game.case2;

import java.util.Arrays;

public class Guess {
	
	private int count;
	
	public boolean checkAB(String input, int[] ans) throws getException{
		count++;
		
		if(input.equals("get")) {
			Arrays.stream(ans).forEach(e -> System.out.print(e));
			System.out.println();
			throw new getException();
		}
		
		int[] user = new int[ans.length];
		int a = 0, b = 0;
		
		if(input.length() != ans.length) {
			System.out.println("輸入數字長度有誤!");
			return false;
		}
		
		for (int i = 0; i < user.length; i++) {
			user[i] = input.charAt(i) - 48;
			if (user[i] == ans[i])
				a++;
			else if(check(user[i], user))
				for(int j : ans)
					if(user[i] == j) {
						b++;
						break;
					}
		}
		if(a == 0 && b == 0)
			System.out.println("None");
		else
			System.out.printf("%s%s\n", (a == 0) ? "" : a + "A", (b == 0) ? "" : b + "B");
		
		return a == 4 ? true : false;
	}
	
	public boolean check(int user, int[] users) {
		int count = 0;
		for(int num : users)
			if(num == user)
				count++;
		return count == 1 ? true : false;
	}

	public int getCount() {
		return count;
	}
}

class getException extends RuntimeException{
	public getException() {
		super();
	}
}