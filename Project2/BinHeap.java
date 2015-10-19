/* BinHeap is a Binary Heap implemented as an array.
 *
 * @authors Christiana Ushana & Devon Grove
 * @version Project 2
 * @version CPE103-9/10
 * @version Fall 2015
 * @version 10/18/15
 */
import java.util.*;

public class BinHeap<T extends Comparable<? super T>> {
	
	public static class MyException extends RuntimeException {
		
		public MyException() {
			super();
		}
		
		public MyException(String message) {
			super(message);
		}
	}
	
	private T[] collection;
	private int size;
	
	/*
	 * Constructs a BinHeap of size 100 if no parameter provided.
	 */
	public BinHeap() {
		collection = (T[]) new Comparable[100]; // generic array declaration? | must use casting
		size = 0;
	}
	
	/*
	 * Constructs a BinHeap of specified size provided.
	 */
	public BinHeap(int wantSize) {
		collection = (T[]) new Comparable[wantSize]; // generic array declaration? | must use casting
		size = 0;
	}
	
	/*
	 * Inserts the given element into the binary heap.
	 * @param T - element to be inserted into array
	 */
	public void insert(T element) {
		// if the array is full, resize it
		if(size >= collection.length) {
			T[] holder = (T[]) new Comparable[collection.length*2]; // new array doubled in size
			for(int i = 0; i < collection.length; i++) {
				holder[i] = collection[i];
			}
			
			collection = holder; // point to new array
		}
		
		for(int i = 0; i < collection.length; i++) {
			if(element.compareTo(collection[i]) < 0) {
				// may need some help with this algorithm
			}
		}
	}
	
	/*
	 * Removes the binary heap root element (min) from the binary heap and returns it.
	 * @return T - element to be inserted into array
	 */
	public T deleteMin() {
		T root = collection[0];
		// remove this element from collection
		size--;
		
		return root;
	}

	/*
	 * Identifies whether binary heap is empty or not.
	 * @return boolean - empty status of binary heap
	 */
	public boolean isEmpty() {
		boolean isEmpty = false;
		
		if(size == 0) {
			isEmpty = true;
		}
		
		return isEmpty;
	}

	/*
	 * Getter for the size of the binary heap
	 * @return int - number of elements in the binary heap
	 */
	public int size() {
		return size;
	}
	
	/*
	 * @Override
	 */
	public String toString() {
		String strHeap = "";
		
		for(int i = 0; i < size; i++) {
			// need to traverse binary heap
		}
		
		return null;
	}
}