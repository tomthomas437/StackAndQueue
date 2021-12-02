package com.stack;

public class Stack {
	Node top;
	int size;
	
		public void push(int data) {
			
			Node tempNode = new Node(data);
			tempNode.next = top;
			top = tempNode;
			size ++;
			
		}
		
		public int pop() {
			if(isEmpty()) {
				System.out.println("The stack is empty");
			}
			int result = top.data;
			top = top.next;
			size--;
			return result;
		}
		
		public void peak() {
			if(isEmpty()) {
				System.out.println("The stack is empty");
		   }
			System.out.println("The data on the top is : " + top.data);
		}
		
		public int size() {
			return size;
		}
		
		
		public boolean isEmpty() {
			return size == 0;
		}
		
		
		public void displayStack() {
			Node current = top;
			
			while (current != null) {
				System.out.println(current.data+" ");
				
				current = current.next;
			}
		}
		
}


