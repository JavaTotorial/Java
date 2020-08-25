package com.pcschool.ocp.finish.d14_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 取得個位數
		Callable<Integer> c1 = () -> new Random().nextInt(10);

		// 取得十位數
		Callable<Integer> c2 = () -> new Random().nextInt(9) + 1;
		Callable<Integer> c3 = () -> new Random().nextInt(9) + 1;

		// 建立 Thread Pool 服務平台 		//@formatter:off	幾條執行緒		//@formatter:on
		ExecutorService service = Executors.newFixedThreadPool(2);
		// 執行工作(可以有 n 個)
		Future<Integer> f1 = service.submit(c1);
		Future<Integer> f2 = service.submit(c2);

		// 得到的結果
		int x_value = f1.get();
		int y_value = f2.get();

		System.out.println(y_value * 10 + x_value);
	}
}
