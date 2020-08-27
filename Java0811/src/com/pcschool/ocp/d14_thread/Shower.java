package com.pcschool.ocp.d14_thread;

public class Shower {
	public static void main(String[] args) {
		Father father = new Father();
		father.start();
	}
}

class Father extends Thread {
	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		Worker worker = new Worker();
		worker.start();
		try {
			worker.join(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}
}

class Worker extends Thread {

	@Override
	public void run() {
		System.out.println("工人開始送瓦斯");
		// 模擬瓦斯的運送時間
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("工人將瓦斯送到家");
	}
}
