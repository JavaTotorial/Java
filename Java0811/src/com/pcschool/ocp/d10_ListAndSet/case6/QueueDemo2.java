package com.pcschool.ocp.d10_ListAndSet.case6;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo2 {
	public static void main(String[] args) {
		Queue<String> queue = new ArrayBlockingQueue<>(3);
		System.out.println(queue.offer("John"));
		System.out.println(queue.offer("Mary"));
		System.out.println(queue.offer("Helen"));
		System.out.println(queue.offer("Jane"));
		// offer 與 add 的差異: 
		// offer在Queue滿了,再加入值時,會回傳 false
		// add  在Queue滿了,再加入值時,會拋出例外
		System.out.println(queue);
	}
}
