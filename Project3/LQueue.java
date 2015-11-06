/*
 * LQueue is a generic class representing a queue as a linked list
 *
 * @authors Christiana Ushana & Devon Grove (djgrove)
 * @version Program 3 (from previous lab assignment)
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 11/6/15
 */

public class LQueue<T> {
	
	private class Node {
		public T element;
		public Node link;
		
		public Node() {
			element = null;
			link = null;
		}
		// added another constructor for simplicity
		public Node(T element, Node link) {
            this.element = element;
            this.link = link;
        }
	}
	
	public static class MyException extends RuntimeException {
		public MyException() {
		}
		
		public MyException(String message) {
			throw new RuntimeException(message);
		}
	}
	
	private Node front;
	private Node end;
	
	public LQueue() {
		front = null;
		end = null;
	}
	
	public void enqueue(T addThis) {
		
		//if empty, we need to initialize the front as well as end
		// if(isEmpty()) {
		// 	front.element = addThis;
		// 	front.link = null;
		// 	end = front;
		// }
		
		// // otherwise just change the end
		// else if(front.link == null)
		// {
		// 	Node next = new Node();
		// 	next.element = addThis;
		// 	front.link = next;
		// 	end = next;
		// }
		
		// else {
		// 	Node next = new Node();
		// 	next.element = addThis;
			
		// 	end.link = next;
		// 	end = next;
		// }

		// used implementation from lecture notes
		if(isEmpty())
		{
			end = front = new Node(addThis, null);
		}
		else
		{
			end = end.link = new Node(addThis, null);
		}

	}
	
	public T dequeue() {
		if(isEmpty()) 
		{
			throw new MyException("MyException dequeue");
		}

		// save values in front node for use
		T dequeued = front.element;
		
		// shift index up after dequeueing
		front = front.link;
		
		return dequeued;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
}
