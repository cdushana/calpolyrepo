import java.util.*;

public class AStack<T> {
	
	private T[] arr;
	private int top;
	
	public AStack(int size) {
		arr = (T[]) new Object[size]; // generic array declaration? | must use casting
		top = -1;
	}
	
	public void push(T addThis) {
		
		if(top >= arr.length - 1) {
			T[] arr2 = (T[]) new Object[arr.length*2]; // new array doubled in size
			for(int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			
			arr = arr2; // point arr to new array
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