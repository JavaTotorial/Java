package com.pcschool.ocp.finish.d14_thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 取得個位數
		Callable<Integer> c1 = () -> new Random().nextInt(10);
		
		// 取得十位數
		Callable<Integer> c2 = () -> new Random().nextInt(9)+1;
		
		// 得到(十位數 * 10 + 個位數)
		FutureTask<Integer> task = new FutureTask<>(c1);
		new Thread(task).start();
		int x_value = task.get();
		
		FutureTask<Integer> task2 = new FutureTask<>(c2);
		new Thread(task).start();
		int y_value = task.get();
		
		System.out.println(x_value*10+y_value);
	}
}
