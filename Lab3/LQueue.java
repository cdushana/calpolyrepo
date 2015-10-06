
public class LQueue<T> {
	
	private class Node {
		public T element;
		public Node link;
		
		public Node() {
			element = null;
			link = null;
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
		front = new Node();
		end = new Node();
	}
	
	public void enqueue(T addThis) {
		
		// if empty, we need to initialize the front as well as end
		if(isEmpty()) {
			front.element = addThis;
			front.link = null;
			end = front;
		}
		
		// otherwise just change the end
		else {
			Node next = new Node();
			next.element = addThis;
			
			end.link = next;
			end = next;
		}
	}
	
	public T dequeue() {
		if(isEmpty()) {
			throw new MyException("MyException dequeue");
		}
		
		// save values in front node for use
		T dequeued = front.element;
		
		// shift index up after dequeueing
		front = front.link;
		
		return dequeued;
	}
	
	public boolean isEmpty() {
		boolean empty = (front == null);
		
		return empty;
	}
}
