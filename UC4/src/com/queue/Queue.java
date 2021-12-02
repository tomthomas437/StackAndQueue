package com.queue;

public class Queue <T> {
	
	private Node<T> front;
	private Node<T> rear;
	private int length;
	
	private static class Node<T> {
		private final T data;
		private Node<T> next;
		
		public Node(T data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	
	public void enQueue(T data) {
		if(front == null) {
			rear = new Node<T>(data);
			front = rear;
		} else {
			rear.next = new Node<T>(data);
			rear = rear.next;
		}
		length++;
	}
	
	public T deQueue() {
		if(front != null) {
			T result = front.data;
			front = front.next;
			length--;
			System.out.println("The deQueue value is : " + result);
		}else {
			System.out.println("The Queue is empty");
		}
		return null;
	}
	
	public int size() {
		return length;
	}
	
	public void displayQueue() {
		Node<T> currentNode = front;
		while(currentNode != null) {
			System.out.println(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
}
