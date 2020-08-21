package com.pcschool.ocp.finish.d09.case2;

import java.util.Random;

public class LottoOne implements Lotto {
	@Override
	public void printNumber() {
		System.out.println(new Random().nextInt(10));
	}
}
