package com.queue;

public class QueueTest {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.displayQueue();
	}
	
}
