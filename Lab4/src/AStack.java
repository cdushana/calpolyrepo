import java.util.*;

public class AStack<T> {
	
	private T[] arr;
	private int top;
	
	public AStack(int size) {
		arr = new T[size];
		top = -1;
	}
	
	public void push(T addThis) {
		
		if(top >= arr.length - 1) {
			// double array
		}
		
		top++;
		
		arr[top] = addThis;
	}
	
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		T popped = arr[top];
		top--;
		
		return popped;
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		T topElement = arr[top];
		
		return topElement;
	}
	
	public boolean isEmpty() {
		return (top < 0);
	}
}