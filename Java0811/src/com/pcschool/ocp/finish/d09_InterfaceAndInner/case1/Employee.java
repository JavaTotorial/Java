package com.pcschool.ocp.finish.d09_InterfaceAndInner.case1;

public class Employee {

	String name = "月例會";

	class Job {
		String name = "Java";

		public void program() {
			String name = "寫程式";
			System.out.println(name + ": " + this.name);

			Study study = new Study();
			study.read();
		}

		public void meating() {
			String name = "開會";
			System.out.println(name + ": " + Employee.this.name);
		}
	}

	private class Study {
		public void read() {
			int hours = 60;
			String appName = "美食 App";

			System.out.println("進修時間: " + hours + " H");

			// 方法內部類別不可有存取修飾子
			class App {
				public void printName() {
					System.out.println(appName); // 取用 final 變數
				}
			}

			App app = new App();
			app.printName();
		}
	}
}
