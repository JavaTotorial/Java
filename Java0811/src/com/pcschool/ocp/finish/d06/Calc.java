package com.pcschool.ocp.finish.d06;

import java.util.Arrays;

public class Calc {
	public int add(int... values) {
		return Arrays.stream(values).sum();
	}
}
