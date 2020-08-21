package com.pcschool.ocp.finish.d09.case2;

import java.util.Random;

public class LottoFour implements Lotto {
	@Override
	public void printNumber() {
		Random r = new Random();
		for(int i = 0;i < 4;i++)
			System.out.print(r.nextInt(10));
		System.out.println();
	}
}
