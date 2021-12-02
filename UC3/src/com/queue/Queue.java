package com.queue;

public class Queue <T> {
	
	private Node<T> front;
	private Node<T> rear;
	
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
	}
	
	public void displayQueue() {
		Node<T> currentNode = front;
		while(currentNode != null) {
			System.out.print(currentNode.data+" ");
			currentNode = currentNode.next;
		}
	}
}







