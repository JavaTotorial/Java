package com.pcschool.ocp.finish.d14_thread;

public class RaceGame {
	public static void main(String[] args) {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + "舉辦了龜兔賽跑的比賽");
		
		Race r1 = new Race("烏龜");
		Race r2 = new Race("兔子");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		// 參與人員(有幾條執行緒)
		int count = Thread.activeCount();
		System.out.println("參與人員: " + count);
		
		r1.start();
		r2.start();
		
		// 參與人員(有幾條執行緒)
		int count2 = Thread.activeCount();
		System.out.println("參與人員: " + count2);
	}
}
