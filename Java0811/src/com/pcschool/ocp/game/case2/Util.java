package com.pcschool.ocp.game.case2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Util {
	public static int[] getRandomIntArray(int n) {
		Set<Integer> set = new HashSet<Integer>();
		for(;set.size() < n;)
			set.add(new Random().nextInt(9)+1);
		return set.stream().mapToInt(e -> e).toArray();
	}
}
