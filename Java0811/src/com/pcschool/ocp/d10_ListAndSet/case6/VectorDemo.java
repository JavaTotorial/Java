package com.pcschool.ocp.d10_ListAndSet.case6;

import java.util.Random;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) throws InterruptedException {
		Vector<Integer> vector = new Vector<>(25, 5);
		
		Random r = new Random();
		for(int i = 1;i <= 26;i++) {
			vector.add(r.nextInt(101));
			System.out.printf("capacity: %d size: %02d %s\n", vector.capacity(), vector.size(), vector);
			
			Thread.sleep(400);
		}
	}
}
