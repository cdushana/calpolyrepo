
public class LQueue<T> {
	
	private class Node {
		public T element;
		public Node link;
	}
	
	public static class MyException extends RuntimeException {
		public MyException() {
		}
		
		public MyException(String message) {
			throw new RuntimeException(message);
		}
	}
	
	private Node front;
	private Node back;
	
	public LQueue() {
		front = null;
		back = null;
	}
	
	public void enqueue(T addThis) {
		
		// if full, double array
		/*
		if( something) {
		
		}
		 */
		
		if(isEmpty()) {
			front.element = addThis;
			front.link = null;
			back = front;
		}
		
		else {
			Node next = null;
			next.element = addThis;
			next.link = null;
			
			back.link = next;
			back = next;
		}
	}
	
	public T dequeue() {
		if(isEmpty()) {
			throw new MyException("MyException dequeue");
		}
		
		// save values in front node for use
		T dequeued = front.element;
		Node next = front.link;
		
		// garbage collection
		
		front = next; // shift index up after dequeueing
		
		return dequeued;
	}
	
	public boolean isEmpty() {
		return (front.element == null);
	}
}
