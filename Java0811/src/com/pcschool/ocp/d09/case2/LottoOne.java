package com.pcschool.ocp.d09.case2;

import java.util.Random;

public class LottoOne implements Lotto {
	@Override
	public void printNumber() {
		System.out.println(new Random().nextInt(10));
	}
}
