package com.stack;
import java.util.LinkedList;

public class Stack {
	Node top;
	
	
		public void push(int data) {
			
			Node tempNode = new Node(data);
			tempNode.next = top;
			top = tempNode;
			
		}
		
		public int pop() {
			int result = top.data;
			top = top.next;
			return result;
		}
		
		public void displayStack() {
			Node current = top;
			
			while (current != null) {
				System.out.println(current.data+" ");
				
				current = current.next;
			}
		}
		
		
}


