package com.pcschool.ocp.finish.d04;

public class ConstrustorDemo2 {
	public static void main(String[] args) {
		Pen p1 = new Pen(10);
		System.out.println(p1);
		
		Pen p2 = new Pen();
		System.out.println(p2);
		
		Pen p3 = new Pen(-6);
		System.out.println(p3);
	}
}
