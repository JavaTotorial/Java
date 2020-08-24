package com.pcschool.ocp.finish.d09_InterfaceAndInner.case1;

public class MyOuter {
	static int x = 200;
	int y = 100;
	
	class MyInner {
		// 一般內部類別不可有 static
		public void print() {
			System.out.println("Print MyInner: " + MyOuter.x + "," + MyOuter.this.y);
			MyStaticInner.print(); // non-static 成員可呼叫 static 成員
		}
	}
	
	// static 內部類別大多用於做結構(如:手機) 
	static class MyStaticInner {
		//static 內部類別沒有 this 指標, 所以不可呼叫 MyOuter.this.y
		public static void print() {
			System.out.println("Print MyStaticInner: " + MyOuter.x);
		}
	}
}
