import java.util.*;

public class AStack<T> {
	
	private T[] arr;
	private int top;
	
	public AStack(int size) {
		arr = new T[size];
		top = -1;
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