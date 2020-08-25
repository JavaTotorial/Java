package com.pcschool.ocp.finish.d14_thread;

public class WalkGame {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Walk(), "烏龜");
		Thread t2 = new Thread(new Walk(), "兔子");
		
		t1.start();
		t2.start();
	}
}
